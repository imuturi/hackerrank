package com.midas.hackerrank;

public class JavaDataTypes {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x+" can be fitted in:");
        if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte");
        if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
        if(x>=-Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
        if(x>=-Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
    }
}
