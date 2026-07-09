/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.selection.ISelection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis.
 */
final class bv
extends Enum<bv> {
    private static /* enum */ bv a;
    private static /* enum */ bv b;
    private static /* enum */ bv c;
    final Function<ISelection[], ISelection[]> a;
    private final String[] a;
    private static final /* synthetic */ bv[] a;

    public static bv[] values() {
        return (bv[])a.clone();
    }

    public static bv valueOf(String string) {
        return Enum.valueOf(bv.class, string);
    }

    private bv(Function<ISelection[], ISelection[]> function, String ... stringArray) {
        super(string, n2);
        this.a = function;
        this.a = stringArray;
    }

    public static bv a(String string) {
        for (bv bv2 : bv.values()) {
            String[] stringArray = bv2.a;
            int n2 = bv2.a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!stringArray[i2].equalsIgnoreCase(string)) continue;
                return bv2;
            }
        }
        return null;
    }

    public static String[] a() {
        HashSet<String> hashSet = new HashSet<String>();
        for (bv bv2 : bv.values()) {
            hashSet.addAll(Arrays.asList(bv2.a));
        }
        return hashSet.toArray(new String[0]);
    }

    private static /* synthetic */ ISelection[] a(ISelection[] iSelectionArray) {
        return new ISelection[]{iSelectionArray[0]};
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.NewAnonymousArray.getDimSize(NewAnonymousArray.java:142)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.isNewArrayLambda(LambdaRewriter.java:463)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:417)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:175)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:106)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.rewriters.ExpressionRewriterHelper.applyForwards(ExpressionRewriterHelper.java:12)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.AbstractConstructorInvokation.applyExpressionRewriter(AbstractConstructorInvokation.java:65)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:104)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredAssignment.rewriteExpressions(StructuredAssignment.java:146)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:89)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
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
}

