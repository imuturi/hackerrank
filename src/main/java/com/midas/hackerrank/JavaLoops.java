package com.midas.hackerrank;

public class JavaLoops {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int n = 5;

        int temp = 0;

        for(int j = 0; j < n;j++){
            System.out.printf("%d %s",temp + a + (int) Math.pow(2,j) * b, "");
            temp = temp + (int) Math.pow(2,j) * b;
        }



    }
}
