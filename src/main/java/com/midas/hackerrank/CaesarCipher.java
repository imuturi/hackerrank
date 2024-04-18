package com.midas.hackerrank;

public class CaesarCipher {

    public static void main(String[] args) {


        String s = "www.abc.xy";
        String s1 = "fff.jkl.gh";


        int k = 87;
        String p;
        String p1;


        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String alphabets1 = alphabets.toUpperCase();

        int lengthOfAlphabets = alphabets.length();

        if(k>lengthOfAlphabets){
            k = k%lengthOfAlphabets;
        }
        p = alphabets.substring(k,lengthOfAlphabets) + alphabets.substring(0,k);
        p1 = alphabets1.substring(k,lengthOfAlphabets) + alphabets1.substring(0,k);

        System.out.println(p);

        String newString = "";

        for(int j = 0; j < s.length(); j++){

            int curr = alphabets.indexOf(s.charAt(j));



            if(curr == -1){

                curr = alphabets1.indexOf(s.charAt(j));

                if(curr == -1){

                    newString = newString + String.valueOf(s.charAt(j));

                }else{
                    newString = newString + String.valueOf(p1.charAt(curr));
                }


            }else {

                newString = newString + String.valueOf(p.charAt(curr));
            }

           // System.out.println(newString);

        }


        System.out.println(newString);
    }
}
