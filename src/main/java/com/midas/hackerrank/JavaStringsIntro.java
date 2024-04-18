package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaStringsIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());
        int i = A.compareTo(B);
        if(A.equals(B)){
            System.out.println("No");
        }else{
            if(i<0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }

        System.out.println(A.substring(0,1).toUpperCase()
                +A.substring(1,A.length())
                +" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));

        List<List<String>> newList = new ArrayList<>();
    }
}
