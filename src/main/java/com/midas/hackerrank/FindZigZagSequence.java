package com.midas.hackerrank;

import java.util.Arrays;

public class FindZigZagSequence {

    public static void findZigZagSequence(int [] a, int n){
        int k = (n + 1)/2;

        System.out.println(k);


        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        for (int i = 0; i < a.length; i++){

            System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.printf("-------------");

        int st = mid + 1;
        int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
