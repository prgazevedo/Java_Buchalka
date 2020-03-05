package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.AccessModifiers;

public class ClassWithIdentifier {
    private static int classCounter=0;
    private final int classIdentifier;

    public ClassWithIdentifier(String name) {
        classCounter++;
        this.classIdentifier = name.hashCode();
    }

    public int getClassIdentifier() {
        return classIdentifier;
    }

    public static int getClassCounter() {
        return classCounter;
    }
}
