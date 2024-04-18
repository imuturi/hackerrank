package com.midas.hackerrank;

import java.util.Date;
import java.util.Scanner;

public class OutPutFormatting {

    public static void main(String[] args) {

        System.out.println("================================");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String s = scanner.nextLine();
            int is = scanner.nextInt();

            System.out.printf("%-15s %03d %n", s, is);
        }
        System.out.println("================================");

        scanner.close();

        String line1 = "java100";
        String line2 = line1.substring(0,line1.length()-3);
        int line3 = 99;



        System.out.printf("'%-15s' %n",line2);
        System.out.printf("%03d%n",line3);

        Date date = new Date();
        System.out.printf("%tT%n", date);
    }
}
