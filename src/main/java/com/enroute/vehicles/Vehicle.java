package com.enroute.vehicles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vehicle {

    private Brand brand;
    private Type type;
    private String model;
    private int year;
    private float millage;


}
