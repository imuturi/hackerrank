package com.midas.hackerrank;

import com.midas.hackerrank.utils.Person;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GridChallenge {
    public static void main(String[] args) throws IOException {
        List<String> grid1 = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        List<String> grid = Arrays.asList("tjxxx", "xtxxj", "rzzzz", "zzrzz", "rzzzz");
        List<String> grid2 = Arrays.asList("vbznfwg", "eacklwk", "bmarzvp", "rwgnjqd", "xqddtln","wuxtduk","rzmfcik");
        List<String> grid3 = Arrays.asList("p");

        String res = "YES";
        int numOfChar = grid.get(0).length();
        char temp;


        for (int i = 0; i < grid.size(); i++) {
            String curr = grid.get(i);

            String s =curr.chars()
                    .mapToObj(k -> (char)k)
                    .sorted()
                    .map(l -> String.valueOf(l))
                    .collect(Collectors.joining());

            grid.set(i,s);


        }

        for (int j = 0; j < numOfChar; j++) {

            for (int i = 0; i < grid.size() -1 ; i++) {
                String curr = grid.get(i);
                String curr1 = grid.get(i+1);
                curr = curr.toLowerCase();
                int size1 = curr.charAt(j) - 'a';
                int size2 = curr1.charAt(j) - 'a';

                System.out.println("size for "+curr.charAt(j)+" = "+size1+" and for "+curr1.charAt(j)+" = "+size2);
                System.out.println(curr.charAt(j)+" ::::next char:::::"+curr1.charAt(j));

                if(size1>size2){
                    res = "NO";
                    break;
                }

            }

            System.out.println("-------------------------------------------");
        }


        System.out.println(res);





    }
}
