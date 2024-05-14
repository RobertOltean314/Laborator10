package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Alex");
        myList.add("Ion");
        myList.add("Vasile");

        //task1NumeLungimePeste6(myList);
        //task2LungimeaNumelor(myList);
        //task3NumeConcatenate(myList);
    }

    public static void task1NumeLungimePeste6(List<String> lista) {
        lista
                .stream()
                .filter(word -> word.length() >= 6)
                .forEach(System.out::println);
    }

    public static void task2LungimeaNumelor(List<String> lista) {
        lista
                .stream()
                .map(word -> word.length())
                .filter((value) -> value <= 4)
                .toList()
                .forEach(System.out::println);
    }

    public static void task3NumeConcatenate(List<String> lista) {
        String result = lista
                .stream()
                .reduce("", (partialString, element) -> partialString + element + " ");
        System.out.println(result);
    }
}