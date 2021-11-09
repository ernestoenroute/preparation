package com.enroute.vehicles.filter;

import com.enroute.vehicles.Vehicle;

import java.util.List;
import java.util.stream.Stream;

public class VehicleFilter implements Filter<Vehicle> {

    @Override
    public Stream<Vehicle> filter(List<Vehicle> vehicles, Feature<Vehicle> feature) {
        return vehicles.stream().filter(feature::hasFeature);
    }
}
