package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LogExtraction {
    public static void main(String[] args) {

        List<List<String>> logs = new ArrayList<>();
        List<String> logg1 = new ArrayList<>();
        List<String> logg3 = new ArrayList<>();
        List<String> logg2 = new ArrayList<>();

        logg1.add("01-01-2022");
        logg1.add("18:00");
        logg1.add("CRITICAL");
        logg1.add("failed");

        logg2.add("01-01-2023");
        logg2.add("18:00");
        logg2.add("ERROR");
        logg2.add("failed");

        logg3.add("01-01-2022");
        logg3.add("18:00");
        logg3.add("SUCCESS");
        logg3.add("failed");

        logs.add(logg3);
        logs.add(logg2);
        logs.add(logg1);

        List<List<String>> res = new ArrayList<>();

        for(List<String> log: logs){
            if(log.get(2)=="ERROR" || log.get(2)=="CRITICAL"){
                System.out.println(log.get(0)+" "+log.get(1)+" "+log.get(2)+" "+log.get(3));
                for(String l : log){

                }
                res.add(log);
            }
        }

        System.out.println("=============================");

        for(List<String> log: res){
            System.out.println(log.get(0)+" "+log.get(1)+" "+log.get(2)+" "+log.get(3));
        }
    }
}
