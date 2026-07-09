/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.FrameNode;
import org.objectweb.asm.tree.IincInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.LineNumberNode;
import org.objectweb.asm.tree.LocalVariableAnnotationNode;
import org.objectweb.asm.tree.LocalVariableNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode$1;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.ParameterNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.TypeAnnotationNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

public class MethodNode
extends MethodVisitor {
    public int access;
    public String name;
    public String desc;
    public String signature;
    public List exceptions;
    public List parameters;
    public List visibleAnnotations;
    public List invisibleAnnotations;
    public List visibleTypeAnnotations;
    public List invisibleTypeAnnotations;
    public List attrs;
    public Object annotationDefault;
    public List[] visibleParameterAnnotations;
    public List[] invisibleParameterAnnotations;
    public InsnList instructions;
    public List tryCatchBlocks;
    public int maxStack;
    public int maxLocals;
    public List localVariables;
    public List visibleLocalVariableAnnotations;
    public List invisibleLocalVariableAnnotations;
    private boolean visited;
    static /* synthetic */ Class class$org$objectweb$asm$tree$MethodNode;

    public MethodNode() {
        this(327680);
        if (this.getClass() != class$org$objectweb$asm$tree$MethodNode) {
            throw new IllegalStateException();
        }
    }

    public MethodNode(int n2) {
        super(n2);
        this.instructions = new InsnList();
    }

    public MethodNode(int n2, String string, String string2, String string3, String[] stringArray) {
        this(327680, n2, string, string2, string3, stringArray);
        if (this.getClass() != class$org$objectweb$asm$tree$MethodNode) {
            throw new IllegalStateException();
        }
    }

    public MethodNode(int n2, int n3, String string, String string2, String string3, String[] stringArray) {
        super(n2);
        boolean bl2;
        this.access = n3;
        this.name = string;
        this.desc = string2;
        this.signature = string3;
        this.exceptions = new ArrayList(stringArray == null ? 0 : stringArray.length);
        boolean bl3 = bl2 = (n3 & 0x400) != 0;
        if (!bl2) {
            this.localVariables = new ArrayList(5);
        }
        this.tryCatchBlocks = new ArrayList();
        if (stringArray != null) {
            this.exceptions.addAll(Arrays.asList(stringArray));
        }
        this.instructions = new InsnList();
    }

    public void visitParameter(String string, int n2) {
        if (this.parameters == null) {
            this.parameters = new ArrayList(5);
        }
        this.parameters.add(new ParameterNode(string, n2));
    }

    public AnnotationVisitor visitAnnotationDefault() {
        return new AnnotationNode(new MethodNode$1(this, 0));
    }

    public AnnotationVisitor visitAnnotation(String string, boolean bl2) {
        AnnotationNode annotationNode = new AnnotationNode(string);
        if (bl2) {
            if (this.visibleAnnotations == null) {
                this.visibleAnnotations = new ArrayList(1);
            }
            this.visibleAnnotations.add(annotationNode);
        } else {
            if (this.invisibleAnnotations == null) {
                this.invisibleAnnotations = new ArrayList(1);
            }
            this.invisibleAnnotations.add(annotationNode);
        }
        return annotationNode;
    }

    public AnnotationVisitor visitTypeAnnotation(int n2, TypePath typePath, String string, boolean bl2) {
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(n2, typePath, string);
        if (bl2) {
            if (this.visibleTypeAnnotations == null) {
                this.visibleTypeAnnotations = new ArrayList(1);
            }
            this.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (this.invisibleTypeAnnotations == null) {
                this.invisibleTypeAnnotations = new ArrayList(1);
            }
            this.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    public AnnotationVisitor visitParameterAnnotation(int n2, String string, boolean bl2) {
        AnnotationNode annotationNode = new AnnotationNode(string);
        if (bl2) {
            if (this.visibleParameterAnnotations == null) {
                int n3 = Type.getArgumentTypes(this.desc).length;
                this.visibleParameterAnnotations = new List[n3];
            }
            if (this.visibleParameterAnnotations[n2] == null) {
                this.visibleParameterAnnotations[n2] = new ArrayList(1);
            }
            this.visibleParameterAnnotations[n2].add(annotationNode);
        } else {
            if (this.invisibleParameterAnnotations == null) {
                int n4 = Type.getArgumentTypes(this.desc).length;
                this.invisibleParameterAnnotations = new List[n4];
            }
            if (this.invisibleParameterAnnotations[n2] == null) {
                this.invisibleParameterAnnotations[n2] = new ArrayList(1);
            }
            this.invisibleParameterAnnotations[n2].add(annotationNode);
        }
        return annotationNode;
    }

    public void visitAttribute(Attribute attribute) {
        if (this.attrs == null) {
            this.attrs = new ArrayList(1);
        }
        this.attrs.add(attribute);
    }

    public void visitCode() {
    }

    public void visitFrame(int n2, int n3, Object[] objectArray, int n4, Object[] objectArray2) {
        this.instructions.add(new FrameNode(n2, n3, objectArray == null ? null : this.getLabelNodes(objectArray), n4, objectArray2 == null ? null : this.getLabelNodes(objectArray2)));
    }

    public void visitInsn(int n2) {
        this.instructions.add(new InsnNode(n2));
    }

    public void visitIntInsn(int n2, int n3) {
        this.instructions.add(new IntInsnNode(n2, n3));
    }

    public void visitVarInsn(int n2, int n3) {
        this.instructions.add(new VarInsnNode(n2, n3));
    }

    public void visitTypeInsn(int n2, String string) {
        this.instructions.add(new TypeInsnNode(n2, string));
    }

    public void visitFieldInsn(int n2, String string, String string2, String string3) {
        this.instructions.add(new FieldInsnNode(n2, string, string2, string3));
    }

    public void visitMethodInsn(int n2, String string, String string2, String string3) {
        if (this.api >= 327680) {
            super.visitMethodInsn(n2, string, string2, string3);
            return;
        }
        this.instructions.add(new MethodInsnNode(n2, string, string2, string3));
    }

    public void visitMethodInsn(int n2, String string, String string2, String string3, boolean bl2) {
        if (this.api < 327680) {
            super.visitMethodInsn(n2, string, string2, string3, bl2);
            return;
        }
        this.instructions.add(new MethodInsnNode(n2, string, string2, string3, bl2));
    }

    public void visitInvokeDynamicInsn(String string, String string2, Handle handle, Object ... objectArray) {
        this.instructions.add(new InvokeDynamicInsnNode(string, string2, handle, objectArray));
    }

    public void visitJumpInsn(int n2, Label label) {
        this.instructions.add(new JumpInsnNode(n2, this.getLabelNode(label)));
    }

    public void visitLabel(Label label) {
        this.instructions.add(this.getLabelNode(label));
    }

    public void visitLdcInsn(Object object) {
        this.instructions.add(new LdcInsnNode(object));
    }

    public void visitIincInsn(int n2, int n3) {
        this.instructions.add(new IincInsnNode(n2, n3));
    }

    public void visitTableSwitchInsn(int n2, int n3, Label label, Label ... labelArray) {
        this.instructions.add(new TableSwitchInsnNode(n2, n3, this.getLabelNode(label), this.getLabelNodes(labelArray)));
    }

    public void visitLookupSwitchInsn(Label label, int[] nArray, Label[] labelArray) {
        this.instructions.add(new LookupSwitchInsnNode(this.getLabelNode(label), nArray, this.getLabelNodes(labelArray)));
    }

    public void visitMultiANewArrayInsn(String string, int n2) {
        this.instructions.add(new MultiANewArrayInsnNode(string, n2));
    }

    public AnnotationVisitor visitInsnAnnotation(int n2, TypePath typePath, String string, boolean bl2) {
        AbstractInsnNode abstractInsnNode = this.instructions.getLast();
        while (abstractInsnNode.getOpcode() == -1) {
            abstractInsnNode = abstractInsnNode.getPrevious();
        }
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(n2, typePath, string);
        if (bl2) {
            if (abstractInsnNode.visibleTypeAnnotations == null) {
                abstractInsnNode.visibleTypeAnnotations = new ArrayList(1);
            }
            abstractInsnNode.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (abstractInsnNode.invisibleTypeAnnotations == null) {
                abstractInsnNode.invisibleTypeAnnotations = new ArrayList(1);
            }
            abstractInsnNode.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    public void visitTryCatchBlock(Label label, Label label2, Label label3, String string) {
        this.tryCatchBlocks.add(new TryCatchBlockNode(this.getLabelNode(label), this.getLabelNode(label2), this.getLabelNode(label3), string));
    }

    public AnnotationVisitor visitTryCatchAnnotation(int n2, TypePath typePath, String string, boolean bl2) {
        TryCatchBlockNode tryCatchBlockNode = (TryCatchBlockNode)this.tryCatchBlocks.get((n2 & 0xFFFF00) >> 8);
        TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(n2, typePath, string);
        if (bl2) {
            if (tryCatchBlockNode.visibleTypeAnnotations == null) {
                tryCatchBlockNode.visibleTypeAnnotations = new ArrayList(1);
            }
            tryCatchBlockNode.visibleTypeAnnotations.add(typeAnnotationNode);
        } else {
            if (tryCatchBlockNode.invisibleTypeAnnotations == null) {
                tryCatchBlockNode.invisibleTypeAnnotations = new ArrayList(1);
            }
            tryCatchBlockNode.invisibleTypeAnnotations.add(typeAnnotationNode);
        }
        return typeAnnotationNode;
    }

    public void visitLocalVariable(String string, String string2, String string3, Label label, Label label2, int n2) {
        this.localVariables.add(new LocalVariableNode(string, string2, string3, this.getLabelNode(label), this.getLabelNode(label2), n2));
    }

    public AnnotationVisitor visitLocalVariableAnnotation(int n2, TypePath typePath, Label[] labelArray, Label[] labelArray2, int[] nArray, String string, boolean bl2) {
        LocalVariableAnnotationNode localVariableAnnotationNode = new LocalVariableAnnotationNode(n2, typePath, this.getLabelNodes(labelArray), this.getLabelNodes(labelArray2), nArray, string);
        if (bl2) {
            if (this.visibleLocalVariableAnnotations == null) {
                this.visibleLocalVariableAnnotations = new ArrayList(1);
            }
            this.visibleLocalVariableAnnotations.add(localVariableAnnotationNode);
        } else {
            if (this.invisibleLocalVariableAnnotations == null) {
                this.invisibleLocalVariableAnnotations = new ArrayList(1);
            }
            this.invisibleLocalVariableAnnotations.add(localVariableAnnotationNode);
        }
        return localVariableAnnotationNode;
    }

    public void visitLineNumber(int n2, Label label) {
        this.instructions.add(new LineNumberNode(n2, this.getLabelNode(label)));
    }

    public void visitMaxs(int n2, int n3) {
        this.maxStack = n2;
        this.maxLocals = n3;
    }

    public void visitEnd() {
    }

    protected LabelNode getLabelNode(Label label) {
        if (!(label.info instanceof LabelNode)) {
            label.info = new LabelNode();
        }
        return (LabelNode)label.info;
    }

    private LabelNode[] getLabelNodes(Label[] labelArray) {
        LabelNode[] labelNodeArray = new LabelNode[labelArray.length];
        for (int i2 = 0; i2 < labelArray.length; ++i2) {
            labelNodeArray[i2] = this.getLabelNode(labelArray[i2]);
        }
        return labelNodeArray;
    }

    private Object[] getLabelNodes(Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length];
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            Object object = objectArray[i2];
            if (object instanceof Label) {
                object = this.getLabelNode((Label)object);
            }
            objectArray2[i2] = object;
        }
        return objectArray2;
    }

    public void check(int n2) {
        if (n2 == 262144) {
            Object object;
            int n3;
            if (this.visibleTypeAnnotations != null && this.visibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleTypeAnnotations != null && this.invisibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            int n4 = this.tryCatchBlocks == null ? 0 : this.tryCatchBlocks.size();
            for (n3 = 0; n3 < n4; ++n3) {
                object = (TryCatchBlockNode)this.tryCatchBlocks.get(n3);
                if (((TryCatchBlockNode)object).visibleTypeAnnotations != null && ((TryCatchBlockNode)object).visibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
                if (((TryCatchBlockNode)object).invisibleTypeAnnotations == null || ((TryCatchBlockNode)object).invisibleTypeAnnotations.size() <= 0) continue;
                throw new RuntimeException();
            }
            for (n3 = 0; n3 < this.instructions.size(); ++n3) {
                boolean bl2;
                object = this.instructions.get(n3);
                if (((AbstractInsnNode)object).visibleTypeAnnotations != null && ((AbstractInsnNode)object).visibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
                if (((AbstractInsnNode)object).invisibleTypeAnnotations != null && ((AbstractInsnNode)object).invisibleTypeAnnotations.size() > 0) {
                    throw new RuntimeException();
                }
                if (!(object instanceof MethodInsnNode) || (bl2 = ((MethodInsnNode)object).itf) == (((AbstractInsnNode)object).opcode == 185)) continue;
                throw new RuntimeException();
            }
            if (this.visibleLocalVariableAnnotations != null && this.visibleLocalVariableAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleLocalVariableAnnotations != null && this.invisibleLocalVariableAnnotations.size() > 0) {
                throw new RuntimeException();
            }
        }
    }

    public void accept(ClassVisitor classVisitor) {
        String[] stringArray = new String[this.exceptions.size()];
        this.exceptions.toArray(stringArray);
        MethodVisitor methodVisitor = classVisitor.visitMethod(this.access, this.name, this.desc, this.signature, stringArray);
        if (methodVisitor != null) {
            this.accept(methodVisitor);
        }
    }

    public void accept(MethodVisitor methodVisitor) {
        AnnotationNode annotationNode;
        int n2;
        Object object;
        int n3;
        int n4 = this.parameters == null ? 0 : this.parameters.size();
        for (n3 = 0; n3 < n4; ++n3) {
            object = (ParameterNode)this.parameters.get(n3);
            methodVisitor.visitParameter(((ParameterNode)object).name, ((ParameterNode)object).access);
        }
        if (this.annotationDefault != null) {
            object = methodVisitor.visitAnnotationDefault();
            AnnotationNode.accept((AnnotationVisitor)object, null, this.annotationDefault);
            if (object != null) {
                ((AnnotationVisitor)object).visitEnd();
            }
        }
        n4 = this.visibleAnnotations == null ? 0 : this.visibleAnnotations.size();
        for (n3 = 0; n3 < n4; ++n3) {
            object = (AnnotationNode)this.visibleAnnotations.get(n3);
            ((AnnotationNode)object).accept(methodVisitor.visitAnnotation(((AnnotationNode)object).desc, true));
        }
        n4 = this.invisibleAnnotations == null ? 0 : this.invisibleAnnotations.size();
        for (n3 = 0; n3 < n4; ++n3) {
            object = (AnnotationNode)this.invisibleAnnotations.get(n3);
            ((AnnotationNode)object).accept(methodVisitor.visitAnnotation(((AnnotationNode)object).desc, false));
        }
        n4 = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (n3 = 0; n3 < n4; ++n3) {
            object = (TypeAnnotationNode)this.visibleTypeAnnotations.get(n3);
            ((AnnotationNode)object).accept(methodVisitor.visitTypeAnnotation(((TypeAnnotationNode)object).typeRef, ((TypeAnnotationNode)object).typePath, ((TypeAnnotationNode)object).desc, true));
        }
        n4 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (n3 = 0; n3 < n4; ++n3) {
            object = (TypeAnnotationNode)this.invisibleTypeAnnotations.get(n3);
            ((AnnotationNode)object).accept(methodVisitor.visitTypeAnnotation(((TypeAnnotationNode)object).typeRef, ((TypeAnnotationNode)object).typePath, ((TypeAnnotationNode)object).desc, false));
        }
        n4 = this.visibleParameterAnnotations == null ? 0 : this.visibleParameterAnnotations.length;
        for (n3 = 0; n3 < n4; ++n3) {
            object = this.visibleParameterAnnotations[n3];
            if (object == null) continue;
            for (n2 = 0; n2 < object.size(); ++n2) {
                annotationNode = (AnnotationNode)object.get(n2);
                annotationNode.accept(methodVisitor.visitParameterAnnotation(n3, annotationNode.desc, true));
            }
        }
        n4 = this.invisibleParameterAnnotations == null ? 0 : this.invisibleParameterAnnotations.length;
        for (n3 = 0; n3 < n4; ++n3) {
            object = this.invisibleParameterAnnotations[n3];
            if (object == null) continue;
            for (n2 = 0; n2 < object.size(); ++n2) {
                annotationNode = (AnnotationNode)object.get(n2);
                annotationNode.accept(methodVisitor.visitParameterAnnotation(n3, annotationNode.desc, false));
            }
        }
        if (this.visited) {
            this.instructions.resetLabels();
        }
        n4 = this.attrs == null ? 0 : this.attrs.size();
        for (n3 = 0; n3 < n4; ++n3) {
            methodVisitor.visitAttribute((Attribute)this.attrs.get(n3));
        }
        if (this.instructions.size() > 0) {
            methodVisitor.visitCode();
            n4 = this.tryCatchBlocks == null ? 0 : this.tryCatchBlocks.size();
            for (n3 = 0; n3 < n4; ++n3) {
                ((TryCatchBlockNode)this.tryCatchBlocks.get(n3)).updateIndex(n3);
                ((TryCatchBlockNode)this.tryCatchBlocks.get(n3)).accept(methodVisitor);
            }
            this.instructions.accept(methodVisitor);
            n4 = this.localVariables == null ? 0 : this.localVariables.size();
            for (n3 = 0; n3 < n4; ++n3) {
                ((LocalVariableNode)this.localVariables.get(n3)).accept(methodVisitor);
            }
            n4 = this.visibleLocalVariableAnnotations == null ? 0 : this.visibleLocalVariableAnnotations.size();
            for (n3 = 0; n3 < n4; ++n3) {
                ((LocalVariableAnnotationNode)this.visibleLocalVariableAnnotations.get(n3)).accept(methodVisitor, true);
            }
            n4 = this.invisibleLocalVariableAnnotations == null ? 0 : this.invisibleLocalVariableAnnotations.size();
            for (n3 = 0; n3 < n4; ++n3) {
                ((LocalVariableAnnotationNode)this.invisibleLocalVariableAnnotations.get(n3)).accept(methodVisitor, false);
            }
            methodVisitor.visitMaxs(this.maxStack, this.maxLocals);
            this.visited = true;
        }
        methodVisitor.visitEnd();
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
        class$org$objectweb$asm$tree$MethodNode = MethodNode.class$("org.objectweb.asm.tree.MethodNode");
    }
}

