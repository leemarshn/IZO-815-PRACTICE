package com.company.streams;

import java.util.HashSet;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class AverageScore {

    public static void main(String[] args) {

        HashSet<Double> scores = new HashSet<>();

        scores.add(70.7);
        scores.add(23.4);
        scores.add(45.9);
        scores.add(34.7);
        scores.add(90.1);

//        Stream<Double> averageScore = (Stream<Double>) scores.stream().mapToDouble((ToDoubleFunction<? super Double>) scores);


    }
}
