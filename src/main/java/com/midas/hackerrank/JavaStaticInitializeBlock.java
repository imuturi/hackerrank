package com.midas.hackerrank;

import java.util.Scanner;

public class JavaStaticInitializeBlock {
    static int b;
    static int h;

    static boolean flag = true;

    public static void main(String[] args) {

        if(flag){
            System.out.println(b * h);
        }
    }

    static {
        Scanner sc = new Scanner(System.in);

        b = sc.nextInt();
        h = sc.nextInt();

        if(b<=0 || h<=0){

            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }
}
