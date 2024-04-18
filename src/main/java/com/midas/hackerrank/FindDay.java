package com.midas.hackerrank;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

public class FindDay {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2024,4,9);

        String res = String.valueOf(date.getDayOfWeek());

        System.out.println("-----------"+res);

        long time = 1427723278405L;

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(sdf.format(new Date(time)));
    }
}
