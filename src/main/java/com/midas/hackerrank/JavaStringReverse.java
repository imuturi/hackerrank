package com.midas.hackerrank;

public class JavaStringReverse {
    public static void main(String[] args) {
        String s = "madam";
        int lengthOfS = s.length();

        boolean isPalindrome = true;
        int half = lengthOfS/2;
        for (int i = 0; i < half; i++) {

            System.out.println(half);
            if(s.charAt(i)!=s.charAt(lengthOfS-1-i) && half>0){
                System.out.println(s.charAt(i)+"==========="+s.charAt(lengthOfS-1-i));
                isPalindrome = false;
                break;
            }
        }



        System.out.println(isPalindrome);
    }
}
