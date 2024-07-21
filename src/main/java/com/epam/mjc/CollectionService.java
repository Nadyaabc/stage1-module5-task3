package com.epam.mjc;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        Stream<Integer> stream = list.stream()
                .filter(n->n%2==0);
        return stream.collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        Stream<String> stream = list.stream()
                .map(String::toUpperCase);
        return stream.collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream()
                .max(Comparator.naturalOrder());

    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .min(Comparator.naturalOrder());

    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}
