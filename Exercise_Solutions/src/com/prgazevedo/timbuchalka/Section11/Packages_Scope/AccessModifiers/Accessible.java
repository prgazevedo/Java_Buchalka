package com.prgazevedo.timbuchalka.Section11.Packages_Scope.AccessModifiers;

//Identify the accessibility

//default is package-private: accessible to members of package and subclasses
interface Accessible {

    int SOME_CONSTANT = 100; // public static final: like all member variables of interfaces!
    public void methodA(); //public: accessible outside the package
    void methodB(); // public: like all member methods of interfaces!
    boolean methodC(); // public: like all member methods of interfaces!
}
