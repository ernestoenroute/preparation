package com.enroute.vehicles.filter;

import com.enroute.vehicles.Brand;
import com.enroute.vehicles.Vehicle;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BrandFeature implements Feature<Vehicle> {

    private Brand brand;

    @Override
    public boolean hasFeature(Vehicle item) {
        return item.getBrand() == brand;
    }
}
