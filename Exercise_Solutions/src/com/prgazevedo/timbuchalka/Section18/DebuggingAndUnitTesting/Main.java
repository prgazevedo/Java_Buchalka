package com.prgazevedo.timbuchalka.Section18.DebuggingAndUnitTesting;

public class Main {

    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();


        String str = "abcdefg";
        String result = utils.upperAndPrefix(utils.addSuffix(str));
        System.out.println(result);
    }
}
