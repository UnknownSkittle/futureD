/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.IncorrectClaimException;
import io.jsonwebtoken.InvalidClaimException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandler;
import io.jsonwebtoken.JwtHandlerAdapter;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.MissingClaimException;
import io.jsonwebtoken.PrematureJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.impl.DefaultClaims;
import io.jsonwebtoken.impl.DefaultClock;
import io.jsonwebtoken.impl.DefaultHeader;
import io.jsonwebtoken.impl.DefaultJws;
import io.jsonwebtoken.impl.DefaultJwsHeader;
import io.jsonwebtoken.impl.DefaultJwt;
import io.jsonwebtoken.impl.compression.DefaultCompressionCodecResolver;
import io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator;
import io.jsonwebtoken.impl.crypto.JwtSignatureValidator;
import io.jsonwebtoken.impl.io.InstanceLocator;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.DeserializationException;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import io.jsonwebtoken.lang.DateFormats;
import io.jsonwebtoken.lang.Objects;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.SignatureException;
import io.jsonwebtoken.security.WeakKeyException;
import java.security.Key;
import java.util.Date;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

public class DefaultJwtParser
implements JwtParser {
    private static final int MILLISECONDS_PER_SECOND = 1000;
    private byte[] keyBytes;
    private Key key;
    private SigningKeyResolver signingKeyResolver;
    private CompressionCodecResolver compressionCodecResolver = new DefaultCompressionCodecResolver();
    private Decoder<String, byte[]> base64UrlDecoder = Decoders.BASE64URL;
    private Deserializer<Map<String, ?>> deserializer;
    private Claims expectedClaims = new DefaultClaims();
    private Clock clock = DefaultClock.INSTANCE;
    private long allowedClockSkewMillis = 0L;

    @Override
    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer) {
        Assert.notNull(deserializer, "deserializer cannot be null.");
        this.deserializer = deserializer;
        return this;
    }

    @Override
    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> base64UrlDecoder) {
        Assert.notNull(base64UrlDecoder, "base64UrlDecoder cannot be null.");
        this.base64UrlDecoder = base64UrlDecoder;
        return this;
    }

    @Override
    public JwtParser requireIssuedAt(Date issuedAt) {
        this.expectedClaims.setIssuedAt(issuedAt);
        return this;
    }

    @Override
    public JwtParser requireIssuer(String issuer) {
        this.expectedClaims.setIssuer(issuer);
        return this;
    }

    @Override
    public JwtParser requireAudience(String audience) {
        this.expectedClaims.setAudience(audience);
        return this;
    }

    @Override
    public JwtParser requireSubject(String subject) {
        this.expectedClaims.setSubject(subject);
        return this;
    }

    @Override
    public JwtParser requireId(String id2) {
        this.expectedClaims.setId(id2);
        return this;
    }

    @Override
    public JwtParser requireExpiration(Date expiration) {
        this.expectedClaims.setExpiration(expiration);
        return this;
    }

    @Override
    public JwtParser requireNotBefore(Date notBefore) {
        this.expectedClaims.setNotBefore(notBefore);
        return this;
    }

    @Override
    public JwtParser require(String claimName, Object value) {
        Assert.hasText(claimName, "claim name cannot be null or empty.");
        Assert.notNull(value, "The value cannot be null for claim name: " + claimName);
        this.expectedClaims.put(claimName, value);
        return this;
    }

    @Override
    public JwtParser setClock(Clock clock) {
        Assert.notNull(clock, "Clock instance cannot be null.");
        this.clock = clock;
        return this;
    }

    @Override
    public JwtParser setAllowedClockSkewSeconds(long seconds) {
        this.allowedClockSkewMillis = Math.max(0L, seconds * 1000L);
        return this;
    }

    @Override
    public JwtParser setSigningKey(byte[] key) {
        Assert.notEmpty(key, "signing key cannot be null or empty.");
        this.keyBytes = key;
        return this;
    }

    @Override
    public JwtParser setSigningKey(String base64EncodedSecretKey) {
        Assert.hasText(base64EncodedSecretKey, "signing key cannot be null or empty.");
        this.keyBytes = Decoders.BASE64.decode(base64EncodedSecretKey);
        return this;
    }

    @Override
    public JwtParser setSigningKey(Key key) {
        Assert.notNull(key, "signing key cannot be null.");
        this.key = key;
        return this;
    }

    @Override
    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver) {
        Assert.notNull(signingKeyResolver, "SigningKeyResolver cannot be null.");
        this.signingKeyResolver = signingKeyResolver;
        return this;
    }

    @Override
    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver) {
        Assert.notNull(compressionCodecResolver, "compressionCodecResolver cannot be null.");
        this.compressionCodecResolver = compressionCodecResolver;
        return this;
    }

    @Override
    public boolean isSigned(String jwt) {
        if (jwt == null) {
            return false;
        }
        int delimiterCount = 0;
        for (int i2 = 0; i2 < jwt.length(); ++i2) {
            char c2 = jwt.charAt(i2);
            if (delimiterCount == 2) {
                return !Character.isWhitespace(c2) && c2 != '.';
            }
            if (c2 != '.') continue;
            ++delimiterCount;
        }
        return false;
    }

    @Override
    public Jwt parse(String jwt) throws ExpiredJwtException, MalformedJwtException, SignatureException {
        String body;
        boolean allowSkew;
        if (this.deserializer == null) {
            InstanceLocator locator = (InstanceLocator)Classes.newInstance("io.jsonwebtoken.impl.io.RuntimeClasspathDeserializerLocator");
            this.deserializer = (Deserializer)locator.getInstance();
        }
        Assert.hasText(jwt, "JWT String argument cannot be null or empty.");
        String base64UrlEncodedHeader = null;
        String base64UrlEncodedPayload = null;
        String base64UrlEncodedDigest = null;
        int delimiterCount = 0;
        StringBuilder sb = new StringBuilder(128);
        for (char c2 : jwt.toCharArray()) {
            if (c2 == '.') {
                String token;
                CharSequence tokenSeq = Strings.clean(sb);
                String string = token = tokenSeq != null ? tokenSeq.toString() : null;
                if (delimiterCount == 0) {
                    base64UrlEncodedHeader = token;
                } else if (delimiterCount == 1) {
                    base64UrlEncodedPayload = token;
                }
                ++delimiterCount;
                sb.setLength(0);
                continue;
            }
            sb.append(c2);
        }
        if (delimiterCount != 2) {
            String msg = "JWT strings must contain exactly 2 period characters. Found: " + delimiterCount;
            throw new MalformedJwtException(msg);
        }
        if (sb.length() > 0) {
            base64UrlEncodedDigest = sb.toString();
        }
        if (base64UrlEncodedPayload == null) {
            throw new MalformedJwtException("JWT string '" + jwt + "' is missing a body/payload.");
        }
        DefaultHeader header = null;
        CompressionCodec compressionCodec = null;
        if (base64UrlEncodedHeader != null) {
            byte[] bytes = this.base64UrlDecoder.decode(base64UrlEncodedHeader);
            String origValue = new String(bytes, Strings.UTF_8);
            Map<String, Object> m2 = this.readValue(origValue);
            header = base64UrlEncodedDigest != null ? new DefaultJwsHeader(m2) : new DefaultHeader(m2);
            compressionCodec = this.compressionCodecResolver.resolveCompressionCodec(header);
        }
        byte[] bytes = this.base64UrlDecoder.decode(base64UrlEncodedPayload);
        if (compressionCodec != null) {
            bytes = compressionCodec.decompress(bytes);
        }
        String payload = new String(bytes, Strings.UTF_8);
        Object claims = null;
        if (payload.charAt(0) == '{' && payload.charAt(payload.length() - 1) == '}') {
            Map<String, Object> claimsMap = this.readValue(payload);
            claims = new DefaultClaims(claimsMap);
        }
        if (base64UrlEncodedDigest != null) {
            JwtSignatureValidator validator;
            String alg;
            JwsHeader jwsHeader = header;
            SignatureAlgorithm algorithm = null;
            if (header != null && Strings.hasText(alg = jwsHeader.getAlgorithm())) {
                algorithm = SignatureAlgorithm.forName(alg);
            }
            if (algorithm == null || algorithm == SignatureAlgorithm.NONE) {
                String msg = "JWT string has a digest/signature, but the header does not reference a valid signature algorithm.";
                throw new MalformedJwtException(msg);
            }
            if (this.key != null && this.keyBytes != null) {
                throw new IllegalStateException("A key object and key bytes cannot both be specified. Choose either.");
            }
            if ((this.key != null || this.keyBytes != null) && this.signingKeyResolver != null) {
                String object = this.key != null ? "a key object" : "key bytes";
                throw new IllegalStateException("A signing key resolver and " + object + " cannot both be specified. Choose either.");
            }
            Key key = this.key;
            if (key == null) {
                byte[] keyBytes = this.keyBytes;
                if (Objects.isEmpty(keyBytes) && this.signingKeyResolver != null) {
                    key = claims != null ? this.signingKeyResolver.resolveSigningKey(jwsHeader, (Claims)claims) : this.signingKeyResolver.resolveSigningKey(jwsHeader, payload);
                }
                if (!Objects.isEmpty(keyBytes)) {
                    Assert.isTrue(algorithm.isHmac(), "Key bytes can only be specified for HMAC signatures. Please specify a PublicKey or PrivateKey instance.");
                    key = new SecretKeySpec(keyBytes, algorithm.getJcaName());
                }
            }
            Assert.notNull(key, "A signing key must be specified if the specified JWT is digitally signed.");
            String jwtWithoutSignature = base64UrlEncodedHeader + '.' + base64UrlEncodedPayload;
            try {
                algorithm.assertValidVerificationKey(key);
                validator = this.createSignatureValidator(algorithm, key);
            } catch (WeakKeyException e2) {
                throw e2;
            } catch (InvalidKeyException | IllegalArgumentException e3) {
                String algName = algorithm.getValue();
                String msg = "The parsed JWT indicates it was signed with the " + algName + " signature algorithm, but the specified signing key of type " + key.getClass().getName() + " may not be used to validate " + algName + " signatures.  Because the specified signing key reflects a specific and expected algorithm, and the JWT does not reflect this algorithm, it is likely that the JWT was not expected and therefore should not be trusted.  Another possibility is that the parser was configured with the incorrect signing key, but this cannot be assumed for security reasons.";
                throw new UnsupportedJwtException(msg, e3);
            }
            if (!validator.isValid(jwtWithoutSignature, base64UrlEncodedDigest)) {
                String msg = "JWT signature does not match locally computed signature. JWT validity cannot be asserted and should not be trusted.";
                throw new SignatureException(msg);
            }
        }
        boolean bl2 = allowSkew = this.allowedClockSkewMillis > 0L;
        if (claims != null) {
            Date nbf;
            Date now = this.clock.now();
            long nowTime = now.getTime();
            Date exp = claims.getExpiration();
            if (exp != null) {
                Date max;
                long maxTime = nowTime - this.allowedClockSkewMillis;
                Date date = max = allowSkew ? new Date(maxTime) : now;
                if (max.after(exp)) {
                    String expVal = DateFormats.formatIso8601(exp, false);
                    String nowVal = DateFormats.formatIso8601(now, false);
                    long differenceMillis = maxTime - exp.getTime();
                    String msg = "JWT expired at " + expVal + ". Current time: " + nowVal + ", a difference of " + differenceMillis + " milliseconds.  Allowed clock skew: " + this.allowedClockSkewMillis + " milliseconds.";
                    throw new ExpiredJwtException(header, (Claims)claims, msg);
                }
            }
            if ((nbf = claims.getNotBefore()) != null) {
                Date min;
                long minTime = nowTime + this.allowedClockSkewMillis;
                Date date = min = allowSkew ? new Date(minTime) : now;
                if (min.before(nbf)) {
                    String nbfVal = DateFormats.formatIso8601(nbf, false);
                    String nowVal = DateFormats.formatIso8601(now, false);
                    long differenceMillis = nbf.getTime() - minTime;
                    String msg = "JWT must not be accepted before " + nbfVal + ". Current time: " + nowVal + ", a difference of " + differenceMillis + " milliseconds.  Allowed clock skew: " + this.allowedClockSkewMillis + " milliseconds.";
                    throw new PrematureJwtException(header, (Claims)claims, msg);
                }
            }
            this.validateExpectedClaims(header, (Claims)claims);
        }
        String string = body = claims != null ? claims : payload;
        if (base64UrlEncodedDigest != null) {
            return new DefaultJws<String>((JwsHeader)((Object)header), body, base64UrlEncodedDigest);
        }
        return new DefaultJwt<String>(header, body);
    }

    private static Object normalize(Object o2) {
        if (o2 instanceof Integer) {
            o2 = ((Integer)o2).longValue();
        }
        return o2;
    }

    private void validateExpectedClaims(Header header, Claims claims) {
        for (String expectedClaimName : this.expectedClaims.keySet()) {
            String msg;
            Object expectedClaimValue = DefaultJwtParser.normalize(this.expectedClaims.get(expectedClaimName));
            Object actualClaimValue = DefaultJwtParser.normalize(claims.get(expectedClaimName));
            if (expectedClaimValue instanceof Date) {
                try {
                    actualClaimValue = claims.get(expectedClaimName, Date.class);
                } catch (Exception e2) {
                    msg = "JWT Claim '" + expectedClaimName + "' was expected to be a Date, but its value cannot be converted to a Date using current heuristics.  Value: " + actualClaimValue;
                    throw new IncorrectClaimException(header, claims, msg);
                }
            }
            InvalidClaimException invalidClaimException = null;
            if (actualClaimValue == null) {
                msg = String.format("Expected %s claim to be: %s, but was not present in the JWT claims.", expectedClaimName, expectedClaimValue);
                invalidClaimException = new MissingClaimException(header, claims, msg);
            } else if (!expectedClaimValue.equals(actualClaimValue)) {
                msg = String.format("Expected %s claim to be: %s, but was: %s.", expectedClaimName, expectedClaimValue, actualClaimValue);
                invalidClaimException = new IncorrectClaimException(header, claims, msg);
            }
            if (invalidClaimException == null) continue;
            invalidClaimException.setClaimName(expectedClaimName);
            invalidClaimException.setClaimValue(expectedClaimValue);
            throw invalidClaimException;
        }
    }

    protected JwtSignatureValidator createSignatureValidator(SignatureAlgorithm alg, Key key) {
        return new DefaultJwtSignatureValidator(alg, key, this.base64UrlDecoder);
    }

    @Override
    public <T> T parse(String compact, JwtHandler<T> handler) throws ExpiredJwtException, MalformedJwtException, SignatureException {
        Assert.notNull(handler, "JwtHandler argument cannot be null.");
        Assert.hasText(compact, "JWT String argument cannot be null or empty.");
        Jwt jwt = this.parse(compact);
        if (jwt instanceof Jws) {
            Jws jws = (Jws)jwt;
            Object body = jws.getBody();
            if (body instanceof Claims) {
                return handler.onClaimsJws(jws);
            }
            return handler.onPlaintextJws(jws);
        }
        Object body = jwt.getBody();
        if (body instanceof Claims) {
            return handler.onClaimsJwt(jwt);
        }
        return handler.onPlaintextJwt(jwt);
    }

    @Override
    public Jwt<Header, String> parsePlaintextJwt(String plaintextJwt) {
        return this.parse(plaintextJwt, new JwtHandlerAdapter<Jwt<Header, String>>(){

            @Override
            public Jwt<Header, String> onPlaintextJwt(Jwt<Header, String> jwt) {
                return jwt;
            }
        });
    }

    @Override
    public Jwt<Header, Claims> parseClaimsJwt(String claimsJwt) {
        try {
            return this.parse(claimsJwt, new JwtHandlerAdapter<Jwt<Header, Claims>>(){

                @Override
                public Jwt<Header, Claims> onClaimsJwt(Jwt<Header, Claims> jwt) {
                    return jwt;
                }
            });
        } catch (IllegalArgumentException iae) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", iae);
        }
    }

    @Override
    public Jws<String> parsePlaintextJws(String plaintextJws) {
        try {
            return this.parse(plaintextJws, new JwtHandlerAdapter<Jws<String>>(){

                @Override
                public Jws<String> onPlaintextJws(Jws<String> jws) {
                    return jws;
                }
            });
        } catch (IllegalArgumentException iae) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", iae);
        }
    }

    @Override
    public Jws<Claims> parseClaimsJws(String claimsJws) {
        return this.parse(claimsJws, new JwtHandlerAdapter<Jws<Claims>>(){

            @Override
            public Jws<Claims> onClaimsJws(Jws<Claims> jws) {
                return jws;
            }
        });
    }

    protected Map<String, ?> readValue(String val) {
        try {
            byte[] bytes = val.getBytes(Strings.UTF_8);
            return this.deserializer.deserialize(bytes);
        } catch (DeserializationException e2) {
            throw new MalformedJwtException("Unable to read JSON value: " + val, e2);
        }
    }
}

