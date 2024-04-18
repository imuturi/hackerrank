package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternsSyntaxChecker {
    public static void main(String[] args) {
        String s1 = "([A-Z])(.+)";
        String s2 = "[AZ[a-z](a-z)";
        String s3 = "batcatpat(nat";


        List<String> words = new ArrayList<>();
        words.add(s1);
        words.add(s3);
        words.add(s2);

        for (String word: words){

            try {
                Pattern.compile(word);
                System.out.println("Valid");

            }catch (PatternSyntaxException ex){
                System.out.println("Invalid");
            }

        }
    }
}
