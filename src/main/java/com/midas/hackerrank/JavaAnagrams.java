package com.midas.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram2(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram2(String a, String b) {

        int a_length = a.length();
        int b_length = b.length();

        if(a_length != b_length) return false;

        int[] charFrequencies = new int[26];

        a = a.toLowerCase();
        b = b.toLowerCase();



        for (int i = 0; i < b.length(); i++) {
            int index = b.charAt(i) - 'a';
            charFrequencies[index]++;
        }

        for (int i = 0; i <charFrequencies.length ; i++) {
            System.out.println(charFrequencies[i]);
        }

        System.out.println("-------------------------------------------------------------");


        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            charFrequencies[index]--;
        }

        for (int i = 0; i <charFrequencies.length ; i++) {
            System.out.println(charFrequencies[i]);
        }

        for (int i = 0; i < 26; i++) {


            if(charFrequencies[i]!=0) return false;
        }

        return true;

    }

    public static boolean isAnagram(String a,String b){
        boolean isAnagram = false;

        HashMap<String, Integer> aStringChars = new HashMap<>();
        HashMap<String, Integer> bStringChars = new HashMap<>();

        if(a.length()==b.length()){

            for (int i = 0; i < a.length(); i++) {
                String currChar = String.valueOf(a.charAt(i)).toUpperCase();

                if(aStringChars.containsKey(currChar)){
                    aStringChars.replace(currChar,aStringChars.get(currChar)+1);
                }else{
                    aStringChars.put(currChar,1);
                }
            }

            for (int i = 0; i < b.length(); i++) {
                String currChar = String.valueOf(b.charAt(i)).toUpperCase();

                if(bStringChars.containsKey(currChar)){
                    bStringChars.replace(currChar,bStringChars.get(currChar)+1);
                }else{
                    bStringChars.put(currChar,1);
                }
            }

        }else {

            isAnagram = false;

        }



        for(Map.Entry<String, Integer> set : aStringChars.entrySet()){
            System.out.println(set.getKey()+"::::::::::::::"+set.getValue());

            if(set.getValue() == bStringChars.get(set.getKey())){
                isAnagram = true;
            }else {
                isAnagram = false;
                break;
            }

        }


        return isAnagram;

    }
}
