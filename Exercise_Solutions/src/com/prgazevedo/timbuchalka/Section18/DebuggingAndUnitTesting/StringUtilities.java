package com.prgazevedo.timbuchalka.Section18.DebuggingAndUnitTesting;

public class StringUtilities {
    private StringBuilder stringBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(char c){
        stringBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str) {
        return str + "_Suffix";
    }

}


