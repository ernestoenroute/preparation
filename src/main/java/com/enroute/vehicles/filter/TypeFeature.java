package com.enroute.vehicles.filter;

import com.enroute.vehicles.Type;
import com.enroute.vehicles.Vehicle;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TypeFeature implements Feature<Vehicle> {

    private Type type;

    @Override
    public boolean hasFeature(Vehicle item) {
        return item.getType() == type;
    }
}
