package com.enroute.vehicles.filter;

@FunctionalInterface
public interface Feature<T> {

    boolean hasFeature(T item);
}
