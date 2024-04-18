package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S);

        System.out.println(S.substring(start,end));

    }
}
