/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.a.h;

import com.a.a.b.ai;
import org.apache.a.ad;

public final class e
implements ad {
    public static final e a = new e();
    private static final String[][] b = new String[][]{null, new String[3], new String[8], new String[8], new String[25], new String[8]};

    protected e() {
    }

    @Override
    public final String a(int n2) {
        ai.a(n2 >= 100 && n2 < 600, "Unknown category for status code ".concat(String.valueOf(n2)));
        int n3 = n2 / 100;
        String string = null;
        if (b[n3].length > (n2 -= n3 * 100)) {
            string = b[n3][n2];
        }
        return string;
    }

    private static void a(int n2, String string) {
        int n3 = n2 / 100;
        e.b[n3][n2 -= n3 * 100] = string;
    }

    static {
        e.a(200, "OK");
        e.a(201, "Created");
        e.a(202, "Accepted");
        e.a(204, "No Content");
        e.a(301, "Moved Permanently");
        e.a(302, "Moved Temporarily");
        e.a(304, "Not Modified");
        e.a(400, "Bad Request");
        e.a(401, "Unauthorized");
        e.a(403, "Forbidden");
        e.a(404, "Not Found");
        e.a(500, "Internal Server Error");
        e.a(501, "Not Implemented");
        e.a(502, "Bad Gateway");
        e.a(503, "Service Unavailable");
        e.a(100, "Continue");
        e.a(307, "Temporary Redirect");
        e.a(405, "Method Not Allowed");
        e.a(409, "Conflict");
        e.a(412, "Precondition Failed");
        e.a(413, "Request Too Long");
        e.a(414, "Request-URI Too Long");
        e.a(415, "Unsupported Media Type");
        e.a(300, "Multiple Choices");
        e.a(303, "See Other");
        e.a(305, "Use Proxy");
        e.a(402, "Payment Required");
        e.a(406, "Not Acceptable");
        e.a(407, "Proxy Authentication Required");
        e.a(408, "Request Timeout");
        e.a(101, "Switching Protocols");
        e.a(203, "Non Authoritative Information");
        e.a(205, "Reset Content");
        e.a(206, "Partial Content");
        e.a(504, "Gateway Timeout");
        e.a(505, "Http Version Not Supported");
        e.a(410, "Gone");
        e.a(411, "Length Required");
        e.a(416, "Requested Range Not Satisfiable");
        e.a(417, "Expectation Failed");
        e.a(102, "Processing");
        e.a(207, "Multi-Status");
        e.a(422, "Unprocessable Entity");
        e.a(419, "Insufficient Space On Resource");
        e.a(420, "Method Failure");
        e.a(423, "Locked");
        e.a(507, "Insufficient Storage");
        e.a(424, "Failed Dependency");
    }
}

