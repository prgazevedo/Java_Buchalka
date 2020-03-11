package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers.AccessModifiers;

public class Password {
    private static final int passwordkey = 123456789;
    private final int password;

    public Password(String password) {
       this.password = encryptDecrypt(password);
    }

/**
 * notice the final keyword in this method.
 * The purpose is to disallow that a subclass can override the method.
 */
    private final int  encryptDecrypt(String password){
        return  password.hashCode() ^ passwordkey ;
    }

    public void letMeIn(String password){
        if(encryptDecrypt(password)==this.password){
            System.out.println("Correct password");
            System.out.println("The stored password was:"+this.password);
        } else System.out.println("Incorrect password");
    }
}
