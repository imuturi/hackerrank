package com.midas.hackerrank;

public class JavaIntToString {
    public static void main(String[] args) {
        int n = 100;

        String s = String.valueOf(n);

        if(n == Integer.parseInt(s)){
            System.out.println("Good job");
        }else {
            System.out.println("Wrong answer.");
        }
    }
}
