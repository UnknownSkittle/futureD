/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.TypePath;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeAnnotationNode;

public class ClassNode
extends ClassVisitor {
    public int version;
    public int access;
    public String name;
    public String signature;
    public String superName;
    public List interfaces = new ArrayList();
    public String sourceFile;
    public String sourceDebug;
    public String outerClass;
    public String outerMethod;
    public String outerMethodDesc;
    public List visibleAnnotations;
    public List invisibleAnnotations;
    public List visibleTypeAnnotations;
    public List invisibleTypeAnnotations;
    public List attrs;
    public List innerClasses = new ArrayList();
    public List fields = new ArrayList();
    public List methods = new ArrayList();
    static /* synthetic */ Class class$org$objectweb$asm$tree$ClassNode;

    public ClassNode() {
        this(327680);
        if (this.getClass() != class$org$objectweb$asm$tree$ClassNode) {
            throw new IllegalStateException();
        }
    }

    public ClassNode(int n2) {
        super(n2);
    }

    public void visit(int n2, int n3, String string, String string2, String string3, String[] stringArray) {
        this.version = n2;
        this.access = n3;
        this.name = string;
        this.signature = string2;
        this.superName = string3;
        if (stringArray != null) {
            this.interfaces.addAll(Arrays.asList(stringArray));
        }
    }

    public void visitSource(String string, String string2) {
        this.sourceFile = string;
        this.sourceDebug = string2;
    }

    public void visitOuterClass(String string, String string2, String string3) {
        this.outerClass = string;
        this.outerMethod = string2;
        this.outerMethodDesc = string3;
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

    public void visitAttribute(Attribute attribute) {
        if (this.attrs == null) {
            this.attrs = new ArrayList(1);
        }
        this.attrs.add(attribute);
    }

    public void visitInnerClass(String string, String string2, String string3, int n2) {
        InnerClassNode innerClassNode = new InnerClassNode(string, string2, string3, n2);
        this.innerClasses.add(innerClassNode);
    }

    public FieldVisitor visitField(int n2, String string, String string2, String string3, Object object) {
        FieldNode fieldNode = new FieldNode(n2, string, string2, string3, object);
        this.fields.add(fieldNode);
        return fieldNode;
    }

    public MethodVisitor visitMethod(int n2, String string, String string2, String string3, String[] stringArray) {
        MethodNode methodNode = new MethodNode(n2, string, string2, string3, stringArray);
        this.methods.add(methodNode);
        return methodNode;
    }

    public void visitEnd() {
    }

    public void check(int n2) {
        if (n2 == 262144) {
            Object object;
            if (this.visibleTypeAnnotations != null && this.visibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            if (this.invisibleTypeAnnotations != null && this.invisibleTypeAnnotations.size() > 0) {
                throw new RuntimeException();
            }
            Iterator iterator = this.fields.iterator();
            while (iterator.hasNext()) {
                object = (FieldNode)iterator.next();
                ((FieldNode)object).check(n2);
            }
            iterator = this.methods.iterator();
            while (iterator.hasNext()) {
                object = (MethodNode)iterator.next();
                ((MethodNode)object).check(n2);
            }
        }
    }

    public void accept(ClassVisitor classVisitor) {
        AnnotationNode annotationNode;
        int n2;
        String[] stringArray = new String[this.interfaces.size()];
        this.interfaces.toArray(stringArray);
        classVisitor.visit(this.version, this.access, this.name, this.signature, this.superName, stringArray);
        if (this.sourceFile != null || this.sourceDebug != null) {
            classVisitor.visitSource(this.sourceFile, this.sourceDebug);
        }
        if (this.outerClass != null) {
            classVisitor.visitOuterClass(this.outerClass, this.outerMethod, this.outerMethodDesc);
        }
        int n3 = this.visibleAnnotations == null ? 0 : this.visibleAnnotations.size();
        for (n2 = 0; n2 < n3; ++n2) {
            annotationNode = (AnnotationNode)this.visibleAnnotations.get(n2);
            annotationNode.accept(classVisitor.visitAnnotation(annotationNode.desc, true));
        }
        n3 = this.invisibleAnnotations == null ? 0 : this.invisibleAnnotations.size();
        for (n2 = 0; n2 < n3; ++n2) {
            annotationNode = (AnnotationNode)this.invisibleAnnotations.get(n2);
            annotationNode.accept(classVisitor.visitAnnotation(annotationNode.desc, false));
        }
        n3 = this.visibleTypeAnnotations == null ? 0 : this.visibleTypeAnnotations.size();
        for (n2 = 0; n2 < n3; ++n2) {
            annotationNode = (TypeAnnotationNode)this.visibleTypeAnnotations.get(n2);
            annotationNode.accept(classVisitor.visitTypeAnnotation(((TypeAnnotationNode)annotationNode).typeRef, ((TypeAnnotationNode)annotationNode).typePath, ((TypeAnnotationNode)annotationNode).desc, true));
        }
        n3 = this.invisibleTypeAnnotations == null ? 0 : this.invisibleTypeAnnotations.size();
        for (n2 = 0; n2 < n3; ++n2) {
            annotationNode = (TypeAnnotationNode)this.invisibleTypeAnnotations.get(n2);
            annotationNode.accept(classVisitor.visitTypeAnnotation(((TypeAnnotationNode)annotationNode).typeRef, ((TypeAnnotationNode)annotationNode).typePath, ((TypeAnnotationNode)annotationNode).desc, false));
        }
        n3 = this.attrs == null ? 0 : this.attrs.size();
        for (n2 = 0; n2 < n3; ++n2) {
            classVisitor.visitAttribute((Attribute)this.attrs.get(n2));
        }
        for (n2 = 0; n2 < this.innerClasses.size(); ++n2) {
            ((InnerClassNode)this.innerClasses.get(n2)).accept(classVisitor);
        }
        for (n2 = 0; n2 < this.fields.size(); ++n2) {
            ((FieldNode)this.fields.get(n2)).accept(classVisitor);
        }
        for (n2 = 0; n2 < this.methods.size(); ++n2) {
            ((MethodNode)this.methods.get(n2)).accept(classVisitor);
        }
        classVisitor.visitEnd();
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
        class$org$objectweb$asm$tree$ClassNode = ClassNode.class$("org.objectweb.asm.tree.ClassNode");
    }
}

