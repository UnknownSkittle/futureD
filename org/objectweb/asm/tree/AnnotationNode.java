/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;

public class AnnotationNode
extends AnnotationVisitor {
    public String desc;
    public List values;
    static /* synthetic */ Class class$org$objectweb$asm$tree$AnnotationNode;

    public AnnotationNode(String string) {
        this(327680, string);
        if (this.getClass() != class$org$objectweb$asm$tree$AnnotationNode) {
            throw new IllegalStateException();
        }
    }

    public AnnotationNode(int n2, String string) {
        super(n2);
        this.desc = string;
    }

    AnnotationNode(List list) {
        super(327680);
        this.values = list;
    }

    public void visit(String string, Object object) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(string);
        }
        if (object instanceof byte[]) {
            byte[] byArray = (byte[])object;
            ArrayList<Byte> arrayList = new ArrayList<Byte>(byArray.length);
            byte[] byArray2 = byArray;
            int n2 = byArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                byte by2 = byArray2[i2];
                arrayList.add(new Byte(by2));
            }
            this.values.add(arrayList);
        } else if (object instanceof boolean[]) {
            boolean[] blArray = (boolean[])object;
            ArrayList<Boolean> arrayList = new ArrayList<Boolean>(blArray.length);
            boolean[] blArray2 = blArray;
            int n3 = blArray2.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2 = blArray2[i3];
                arrayList.add(bl2);
            }
            this.values.add(arrayList);
        } else if (object instanceof short[]) {
            short[] sArray = (short[])object;
            ArrayList<Short> arrayList = new ArrayList<Short>(sArray.length);
            short[] sArray2 = sArray;
            int n4 = sArray2.length;
            for (int i4 = 0; i4 < n4; ++i4) {
                short s2 = sArray2[i4];
                arrayList.add(new Short(s2));
            }
            this.values.add(arrayList);
        } else if (object instanceof char[]) {
            char[] cArray = (char[])object;
            ArrayList<Character> arrayList = new ArrayList<Character>(cArray.length);
            char[] cArray2 = cArray;
            int n5 = cArray2.length;
            for (int i5 = 0; i5 < n5; ++i5) {
                char c2 = cArray2[i5];
                arrayList.add(new Character(c2));
            }
            this.values.add(arrayList);
        } else if (object instanceof int[]) {
            int[] nArray = (int[])object;
            ArrayList<Integer> arrayList = new ArrayList<Integer>(nArray.length);
            int[] nArray2 = nArray;
            int n6 = nArray2.length;
            for (int i6 = 0; i6 < n6; ++i6) {
                int n7 = nArray2[i6];
                arrayList.add(new Integer(n7));
            }
            this.values.add(arrayList);
        } else if (object instanceof long[]) {
            long[] lArray = (long[])object;
            ArrayList<Long> arrayList = new ArrayList<Long>(lArray.length);
            long[] lArray2 = lArray;
            int n8 = lArray2.length;
            for (int i7 = 0; i7 < n8; ++i7) {
                long l2 = lArray2[i7];
                arrayList.add(new Long(l2));
            }
            this.values.add(arrayList);
        } else if (object instanceof float[]) {
            float[] fArray = (float[])object;
            ArrayList<Float> arrayList = new ArrayList<Float>(fArray.length);
            float[] fArray2 = fArray;
            int n9 = fArray2.length;
            for (int i8 = 0; i8 < n9; ++i8) {
                float f2 = fArray2[i8];
                arrayList.add(new Float(f2));
            }
            this.values.add(arrayList);
        } else if (object instanceof double[]) {
            double[] dArray = (double[])object;
            ArrayList<Double> arrayList = new ArrayList<Double>(dArray.length);
            double[] dArray2 = dArray;
            int n10 = dArray2.length;
            for (int i9 = 0; i9 < n10; ++i9) {
                double d2 = dArray2[i9];
                arrayList.add(new Double(d2));
            }
            this.values.add(arrayList);
        } else {
            this.values.add(object);
        }
    }

    public void visitEnum(String string, String string2, String string3) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(string);
        }
        this.values.add(new String[]{string2, string3});
    }

    public AnnotationVisitor visitAnnotation(String string, String string2) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(string);
        }
        AnnotationNode annotationNode = new AnnotationNode(string2);
        this.values.add(annotationNode);
        return annotationNode;
    }

    public AnnotationVisitor visitArray(String string) {
        if (this.values == null) {
            this.values = new ArrayList(this.desc != null ? 2 : 1);
        }
        if (this.desc != null) {
            this.values.add(string);
        }
        ArrayList arrayList = new ArrayList();
        this.values.add(arrayList);
        return new AnnotationNode(arrayList);
    }

    public void visitEnd() {
    }

    public void check(int n2) {
    }

    public void accept(AnnotationVisitor annotationVisitor) {
        if (annotationVisitor != null) {
            if (this.values != null) {
                for (int i2 = 0; i2 < this.values.size(); i2 += 2) {
                    String string = (String)this.values.get(i2);
                    Object e2 = this.values.get(i2 + 1);
                    AnnotationNode.accept(annotationVisitor, string, e2);
                }
            }
            annotationVisitor.visitEnd();
        }
    }

    static void accept(AnnotationVisitor annotationVisitor, String string, Object object) {
        if (annotationVisitor != null) {
            if (object instanceof String[]) {
                String[] stringArray = (String[])object;
                annotationVisitor.visitEnum(string, stringArray[0], stringArray[1]);
            } else if (object instanceof AnnotationNode) {
                AnnotationNode annotationNode = (AnnotationNode)object;
                annotationNode.accept(annotationVisitor.visitAnnotation(string, annotationNode.desc));
            } else if (object instanceof List) {
                AnnotationVisitor annotationVisitor2 = annotationVisitor.visitArray(string);
                if (annotationVisitor2 != null) {
                    List list = (List)object;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        AnnotationNode.accept(annotationVisitor2, null, list.get(i2));
                    }
                    annotationVisitor2.visitEnd();
                }
            } else {
                annotationVisitor.visit(string, object);
            }
        }
    }

    static /* synthetic */ Class class$(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classNotFoundException) {
            String string2 = classNotFoundException.getMessage();
            throw new NoClassDefFoundError(string2);
        }
    }

    static {
        class$org$objectweb$asm$tree$AnnotationNode = AnnotationNode.class$("org.objectweb.asm.tree.AnnotationNode");
    }
}

