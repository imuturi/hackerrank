package com.midas.hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int lineNumber = 1;

        while (sc.hasNext()){
            System.out.println(lineNumber+" "+sc.nextLine());
        }

        sc.close();


    }
}
