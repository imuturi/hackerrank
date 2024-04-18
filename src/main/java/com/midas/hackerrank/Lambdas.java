package com.midas.hackerrank;

import com.midas.hackerrank.utils.Animal;

public class Lambdas {
    public static void main(String[] args) {
        Animal animal = (s) -> "Meow"+s;
        animal(animal);


    }

    public static void animal(Animal object){
        object.speak("!");
    }
}
