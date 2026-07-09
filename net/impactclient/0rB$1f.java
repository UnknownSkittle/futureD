/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class 0rB$1f
extends Thread {
    private static volatile Object[] GJGQ;
    private static HashMap uQeD;
    public static final boolean \u2003\u2006\u200c\u200a\u200d\u2000;

    /*
     * Unable to fully structure code
     */
    private void OPNf() {
        block4: {
            var6_1 = 0rB$1f.\u2003\u2006\u200c\u200a\u200d\u2000;
            if (var6_1 || var6_1) lbl-1000:
            // 21 sources

            {
                return;
            }
            0rB$1f.GJGQ = new Object[5];
            if (var6_1 || var6_1) ** GOTO lbl-1000
            var1_2 = this.getStackTrace();
            if (var6_1 || var6_1) ** GOTO lbl-1000
            var2_3 = 0rB$1f.class.getDeclaredMethods();
            if (var6_1 || var6_1) ** GOTO lbl-1000
            var3_4 = Runtime.getRuntime();
            if (var6_1 || var6_1) ** GOTO lbl-1000
            var4_5 = 0;
            if (var6_1 || var6_1) ** GOTO lbl-1000
            if (!0rB$1f.\u2003\u2006\u200c\u200a\u200d\u2000) ** GOTO lbl33
            throw null;
lbl-1000:
            // 1 sources

            {
                block5: {
                    if (var6_1) ** GOTO lbl-1000
                    var5_6 = var2_3[var4_5];
                    if (var6_1 || var6_1) ** GOTO lbl-1000
                    if (var5_6.getReturnType() != String.class) break block5;
                    if (var6_1) ** GOTO lbl-1000
                    if (!Arrays.equals(var5_6.getParameterTypes(), new Class[]{Object.class, Integer.TYPE})) break block5;
                    if (var6_1 || var6_1) ** GOTO lbl-1000
                    0rB$1f.GJGQ[4] = var5_6.getName().hashCode();
                    if (var6_1 || var6_1) ** GOTO lbl-1000
                    if (0rB$1f.\u2003\u2006\u200c\u200a\u200d\u2000) {
                        throw null;
                    }
                    break block4;
                }
                if (var6_1) ** GOTO lbl-1000
                ++var4_5;
                if (var6_1) ** GOTO lbl-1000
lbl33:
                // 2 sources

                if (var6_1) ** GOTO lbl-1000
                ** while (var4_5 < var2_3.length)
            }
lbl35:
            // 1 sources

            if (var6_1) ** GOTO lbl-1000
        }
        if (var6_1) ** GOTO lbl-1000
        var4_5 = var3_4.availableProcessors();
        if (var6_1 || var6_1) ** GOTO lbl-1000
        0rB$1f.GJGQ[0] = (var4_5 + 1) % var4_5;
        if (var6_1 || var6_1) ** GOTO lbl-1000
        0rB$1f.GJGQ[1] = var1_2[(Integer)0rB$1f.GJGQ[0]].getClassName().hashCode();
        if (var6_1 || var6_1) ** GOTO lbl-1000
        0rB$1f.GJGQ[2] = var1_2[(Integer)0rB$1f.GJGQ[0]].getMethodName().hashCode();
        if (var6_1 || var6_1) ** GOTO lbl-1000
        0rB$1f.GJGQ[3] = (Integer)0rB$1f.GJGQ[0] << 1;
        if (!var6_1 && !var6_1) ** break;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public 0rB$1f() {
        boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
        if (bl2) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ZzeD() throws InterruptedException {
        block3: {
            block2: {
                boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
                if (bl2 || bl2) break block2;
                0rB$1f rB$1f = new 0rB$1f();
                if (bl2 || bl2) break block2;
                rB$1f.start();
                if (bl2 || bl2) break block2;
                rB$1f.join();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void run() {
        block3: {
            block2: {
                boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
                if (bl2 || bl2) break block2;
                this.OPNf();
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    private static String dFmK(String string) {
        boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
        if (bl2 || bl2) {
            return null;
        }
        return (String)uQeD.get(string);
    }

    static {
        boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
        if (bl2 || bl2) {
        } else {
            uQeD = new HashMap();
            if (!bl2) {
                // empty if block
            }
        }
    }

    /*
     * Exception decompiling
     */
    public static String XNZw(Object var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK], 2[TRYBLOCK]], but top level block is 10[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:538)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at async.DecompilerRunnable.cfrDecompilation(DecompilerRunnable.java:718)
         *     at async.DecompilerRunnable.call(DecompilerRunnable.java:679)
         *     at controllers.HeadlessController.lambda$headlessDecompile$2(HeadlessController.java:90)
         *     at java.base/java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1804)
         *     at java.base/java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1796)
         *     at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:387)
         *     at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1312)
         *     at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1843)
         *     at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1808)
         *     at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:188)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IsuQ(String string, String string2) {
        block3: {
            block2: {
                boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
                if (bl2 || bl2) break block2;
                uQeD.put(string, string2);
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    private static boolean Xict(String string) {
        boolean bl2 = \u2003\u2006\u200c\u200a\u200d\u2000;
        if (bl2 || bl2) {
            return true;
        }
        return uQeD.containsKey(string);
    }
}

