package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.AccessModifiers;

public class StaticTest {
    //static variable is associated with the class and not each instance
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        //notice that a non-static method can access static variable (and methods).
        // The same is not true the other way around.
        return numInstances;
    }

    //This is the correct way to do it -> use a static method to access a static variable
    public static int staticGetNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
