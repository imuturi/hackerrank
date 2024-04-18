package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaSubstringComparison {
    public static void main(String[] args) {
        String s = "wElcometojava";
        int k = 3;

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i <= s.length()-k; i++) {
            stringList.add(s.substring(i,i+k));
        }

//        String temp = "";
//
//
//        for (int i = 0; i < stringList.size() - 1; i++) {
//            int j = stringList.get(i).compareTo(stringList.get(i+1));
//
//            System.out.println(j);
//            System.out.println(stringList.get(i) + "   "+stringList.get(i+1));
//
//            if(j>0){
//                temp = stringList.get(i+1);
//                stringList.add(i+1,stringList.get(i));
//                stringList.add(i,temp);
//
//            }
//        }

        stringList = stringList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(stringList.size()-1));
    }
}
