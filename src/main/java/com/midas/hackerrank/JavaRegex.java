package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class JavaRegex {
    public static void main(String[] args) {
        List<String> ips = new ArrayList<>();

        ips.add("000.12.12.034");
        ips.add("000.12.12.134");
        ips.add("121.234.12.12");
        ips.add("23.45.12.56");
        ips.add("00.12.123.123123.123");
        ips.add("122.23");
        ips.add("Hello.IP");

        for(String ip: ips){
            System.out.println(ip.matches(new MyRegex().pattern()));
        }
    }

}

class MyRegex{
    public static String pattern(){
        String pattern1 = "[0-9]{1,3}[\\.][0-9]{1,3}[\\.][0-9]{1,3}[\\.][0-9]{1,3}";
        String pattern = "(([0-9]|[0-9][0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9][0-9]|0[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

        return pattern;
    }
}