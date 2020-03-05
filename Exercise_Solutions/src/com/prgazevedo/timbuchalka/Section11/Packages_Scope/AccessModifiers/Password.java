package com.prgazevedo.timbuchalka.Section11.Packages_Scope.AccessModifiers;

public class Password {
    private static final int passwordkey = 123456789;
    private final int password;

    public Password(String password) {
       this.password = encryptDecrypt(password);
    }

    private int encryptDecrypt(String password){
        return  password.hashCode() ^ passwordkey ;
    }

    public void letMeIn(String password){
        if(encryptDecrypt(password)==this.password){
            System.out.println("Correct password");
            System.out.println("The stored password was:"+this.password);
        } else System.out.println("Incorrect password");
    }
}
