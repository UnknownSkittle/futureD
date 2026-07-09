/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package io.jsonwebtoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandler;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.security.SignatureException;
import java.security.Key;
import java.util.Date;
import java.util.Map;

public interface JwtParser {
    public static final char SEPARATOR_CHAR = '.';

    public JwtParser requireId(String var1);

    public JwtParser requireSubject(String var1);

    public JwtParser requireAudience(String var1);

    public JwtParser requireIssuer(String var1);

    public JwtParser requireIssuedAt(Date var1);

    public JwtParser requireExpiration(Date var1);

    public JwtParser requireNotBefore(Date var1);

    public JwtParser require(String var1, Object var2);

    public JwtParser setClock(Clock var1);

    public JwtParser setAllowedClockSkewSeconds(long var1);

    public JwtParser setSigningKey(byte[] var1);

    public JwtParser setSigningKey(String var1);

    public JwtParser setSigningKey(Key var1);

    public JwtParser setSigningKeyResolver(SigningKeyResolver var1);

    public JwtParser setCompressionCodecResolver(CompressionCodecResolver var1);

    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> var1);

    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> var1);

    public boolean isSigned(String var1);

    public Jwt parse(String var1) throws ExpiredJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;

    public <T> T parse(String var1, JwtHandler<T> var2) throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;

    public Jwt<Header, String> parsePlaintextJwt(String var1) throws UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;

    public Jwt<Header, Claims> parseClaimsJwt(String var1) throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;

    public Jws<String> parsePlaintextJws(String var1) throws UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;

    public Jws<Claims> parseClaimsJws(String var1) throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SignatureException, IllegalArgumentException;
}

