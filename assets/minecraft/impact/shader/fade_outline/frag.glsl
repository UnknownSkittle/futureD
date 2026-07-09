#version 120

uniform sampler2D sampler;
uniform vec2 texel;
uniform int width;
uniform bool filled;
uniform float opacity;

void main() {
    // Pretty much all credit here goes to CyberBrick
    // I've fixed a few things but other than that this was all him

    vec4 centerCol = texture2D(sampler, gl_TexCoord[0].st);
    vec4 colAvg = vec4(0, 0, 0, 0);
    if (centerCol.a != 0.0F) {
        if (filled) {
            gl_FragColor = vec4(centerCol.r, centerCol.g, centerCol.b, opacity);
        } else {
            gl_FragColor = colAvg;
        }
        return;
    }

    float divisor = 1;
    for (int xo = -7; xo < 7; xo++) {
        for (int yo = -7; yo < 7; yo++) {
            vec4 currCol = texture2D(sampler, gl_TexCoord[0].st + vec2(xo * texel.x, yo * texel.y));
            if (currCol.a != 0.0F) {
                float fade = max(0, (6.0f - sqrt(xo * xo * width + yo * yo * width)) / 2.0F);
                colAvg += vec4(fade * currCol.r, fade * currCol.g, fade * currCol.b, 1.0F);
                divisor++;
            }
        }
    }

    colAvg /= vec4(divisor * 0.5F, divisor * 0.5F, divisor * 0.5F, 64.0F);
    gl_FragColor = colAvg;
}
