package com.midas.hackerrank;

import com.midas.hackerrank.utils.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Ian",6000,10));
        people.add(new Person("Bezos",20000,18));
        people.add(new Person("Warren",120000,14));
        people.add(new Person("Bill",100000,12));
        people.add(new Person("Elon",500000,2));
        people.add(new Person("Alfie",4000,12));


        people.add(new Person("Ian",6000,10));
        people.add(new Person("Bezos",20000,18));
        people.add(new Person("Warren",120000,14));
        people.add(new Person("Bill",100000,12));
        people.add(new Person("Elon",500000,2));
        people.add(new Person("Alfie",4000,12));


        //people.stream().map(s -> s.getNetWorth()>100000).forEach(System.out::println);

        System.out.println(people.stream().count());
        System.out.println();


        //Integer Streams
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();
        System.out.println();

        //Skip
        IntStream.range(1,10).skip(3).forEach(x -> System.out.println(x));
        System.out.println();

        //Sum
        System.out.println(IntStream.range(1,5).sum());
        System.out.println();

        //Stream Of
        Stream.of("Ian","Agnes","Noel","Miguel").sorted().findFirst().ifPresent(System.out::println);
        System.out.println();

        //Arrays of
        String[] names = {"Ian","Agnes","Noel","Miguel","Naida","Munene","Muturi"};
        Arrays.stream(names).filter(x -> x.startsWith("M")).sorted().forEach(System.out::println);
        System.out.println();

        //Average of Squares
        Arrays.stream(new int[]{2,4,6,8,10}).map(x -> x * x).average().ifPresent(System.out::println);
        System.out.println();

        //Stream Filter To lowercase
        Stream.of(names).map(String::toLowerCase).filter(x -> x.startsWith("n"))
                .sorted(Comparator.naturalOrder()).forEach(System.out::println);
        System.out.println();


        //Files Stream

        Stream<String> bands = Files.lines(Paths.get("E:\\Downloads\\bands.txt"));
        //bands.sorted().filter(x -> x.length()>13).forEach(System.out::println);
        bands.close();

        System.out.println();

        //Contains
        List<String> bands2 = Files.lines(Paths.get("E:\\Downloads\\bands.txt"))
                .filter(x -> x.contains("hip")).collect(Collectors.toList());

        bands2.forEach(System.out::println);
        System.out.println();

        //Data CSV
        Stream<String> rows = Files.lines(Paths.get("E:\\Downloads\\data.txt"));
        Long count = rows.map(x->x.split(",")).filter(x -> x.length==3).count();
        System.out.println(count);
        System.out.println();
        rows.close();

        //Data CSV
        Stream<String> rows1 = Files.lines(Paths.get("E:\\Downloads\\data.txt"));
        rows1
                .map(x -> x.split(","))
                .filter(x -> x.length==3)
                .filter(x -> Integer.parseInt(x[1])>15)
                .forEach(x -> System.out.println(x[0]+"  "+x[1]+"  "+x[2]));
        rows1.close();
        System.out.println();

        String nameofFirst = people.stream().findFirst().get().getName();

        System.out.println("00000000000000000000   "+nameofFirst);
        List<Person> tenClubList = people.stream()
                .filter(person -> person.getNetWorth()>10000)
                .sorted(Comparator.comparing(person -> person.getName()))
                        .collect(Collectors.toList());

        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.getName())).collect(Collectors.toList());

        //tenClubList.forEach(p -> System.out.println(p.getName()));
        sortedList.forEach(p -> System.out.println(p.getName()));


        //IntStream.range(0,10).forEach(System.out::println);

    }
}
