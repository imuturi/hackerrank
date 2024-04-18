package com.midas.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexDuplicateWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Goodbye lion bye bye world world world");
        words.add("Sam lion went went to to to his business");
        words.add("Reya is is the the best player in eye eye game");
        words.add("in inthe");
        words.add("Hello hello Ab aB");

        String regex = "\\b(\\w+)(?:\\W\\1\\b)+";


        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for(String word: words){

            Matcher matcher = pattern.matcher(word);
            System.out.println(word.replaceAll(matcher.group(),matcher.group(1)));

        }
    }
}
