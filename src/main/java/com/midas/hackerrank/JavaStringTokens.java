package com.midas.hackerrank;

import java.util.Arrays;

public class JavaStringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";


        String[] tokens = s.split("[^a-zA-Z]+");


        System.out.println(tokens.length);
        //Arrays.stream(tokens).forEach(System.out::println);

        String myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());
        Arrays.stream(myStr.split("[^a-zA-Z]+")).forEach(System.out::println);
    }
}
