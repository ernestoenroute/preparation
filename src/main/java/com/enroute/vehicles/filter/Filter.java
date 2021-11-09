package com.enroute.vehicles.filter;

import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
public interface Filter <T> {

    Stream<T> filter(List<T> vehicles, Feature<T> feature);
}
