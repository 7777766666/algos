package com.example.algos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApi {

    private static Logger log = LoggerFactory.getLogger(StreamApi.class);

    public static void main(String[] args) {
        log.info("Hello logger");

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        String read = scanner.nextLine();
        String replaceAll = read.replaceAll("[^a-zA-Z0-9]", " ");
        log.info(replaceAll);
        String[] split = replaceAll.split(" ");
        log.info(Arrays.toString(split));


        List<String> list = Arrays.stream(split)
                .filter(str -> !str.isEmpty())
                .map(String::toLowerCase)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                )
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.<String, Long>comparingByKey())
                )
                .limit(10)
//                .map(x -> x.getKey())
                .map(Map.Entry::getKey)
                .toList();

        log.info("print result");
        list.forEach(System.out::println);


    }
}
