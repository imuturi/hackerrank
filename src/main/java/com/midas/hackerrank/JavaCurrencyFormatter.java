package com.midas.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Locale.CHINA.getCountry();


        Scanner sc = new Scanner(System.in);

        Double amount = sc.nextDouble();

        System.out.println("US:"+NumberFormat.getCurrencyInstance(Locale.US).format(amount));
        System.out.println("India:"+NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(amount));
        System.out.println("China:"+NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
        System.out.println("France:"+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));


    }
}
