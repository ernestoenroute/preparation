package com.enroute.vehicles;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
@Builder
public class Vehicle implements Serializable {

    private Brand brand;
    private Type type;
    private String model;
    private int year;
    //Be careful not to get confused with @Transient.
    // The transient keyword has the same effect as the @Transient annotation when saving to a database.
    // However, the @Transient annotation does not affect Java object serialization.
    private transient float mileage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Float.compare(vehicle.mileage, mileage) == 0 && brand == vehicle.brand && type == vehicle.type && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type, model, year, mileage);
    }
}
