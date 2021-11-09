package com.enroute.vehicles;

import com.enroute.vehicles.filter.BrandFeature;
import com.enroute.vehicles.filter.Feature;
import com.enroute.vehicles.filter.TypeFeature;
import com.enroute.vehicles.filter.VehicleFilter;

import java.util.ArrayList;
import java.util.List;

public class VehicleFilterApp {

    public void filterVehicles() {

        List<Vehicle> vehicles = getVehicles();

        VehicleFilter vehicleFilter = new VehicleFilter();

        Feature<Vehicle> brandFeature = new BrandFeature(Brand.NISSAN);
        vehicleFilter.filter(vehicles, brandFeature)
                .forEach(vehicle -> System.out.println("NISSAN: " + vehicle));

        System.out.println("--");

        Feature<Vehicle> typeFeature = new TypeFeature(Type.SEDAN);
        vehicleFilter.filter(vehicles, typeFeature)
                .forEach(vehicle -> System.out.println("SEDAN: " + vehicle));

        System.out.println("--");

        Feature<Vehicle> modelFeature = (Vehicle vehicle)-> vehicle.getModel().equals("Civic");

        vehicleFilter.filter(vehicles, modelFeature)
                .forEach(vehicle -> System.out.println("CIVIC: " + vehicle));

        System.out.println("--");

        Feature<Vehicle> yearFeature = (Vehicle vehicle)-> vehicle.getYear() == 2019;

        vehicleFilter.filter(vehicles, yearFeature)
                .forEach(vehicle -> System.out.println("2019: " + vehicle));

        System.out.println("--");

        Feature<Vehicle> complexFeature = (Vehicle vehicle)->
                vehicle.getType() == Type.HATCHBACK && vehicle.getYear() == 2019;

        vehicleFilter.filter(vehicles, complexFeature)
                .forEach(vehicle -> System.out.println("2019 and HATCHBACK: " + vehicle));

        System.out.println("--");

        Feature<Vehicle> orFeature = (Vehicle vehicle)->
                vehicle.getType() == Type.SUV || vehicle.getYear() == 2019;

        vehicleFilter.filter(vehicles, orFeature)
                .forEach(vehicle -> System.out.println("2019 or SUV: " + vehicle));


    }

    private List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>(3);

        Vehicle xtrail = Vehicle.builder()
                .brand(Brand.NISSAN)
                .type(Type.SUV)
                .model("X-Trail")
                .year(2020)
                .build();
        vehicles.add(xtrail);

        Vehicle mazda3 = Vehicle.builder()
                .brand(Brand.MAZDA)
                .type(Type.SEDAN)
                .model("Mazda 3")
                .year(2021)
                .build();
        vehicles.add(mazda3);

        Vehicle civic = Vehicle.builder()
                .brand(Brand.MAZDA)
                .type(Type.HATCHBACK)
                .model("Civic")
                .year(2019)
                .build();
        vehicles.add(civic);

        Vehicle lobo = Vehicle.builder()
                .brand(Brand.FORD)
                .type(Type.PICKUP)
                .model("Lobo")
                .year(2019)
                .build();
        vehicles.add(lobo);

        Vehicle crv = Vehicle.builder()
                .brand(Brand.HONDA)
                .type(Type.SUV)
                .model("CRV")
                .year(2020)
                .build();
        vehicles.add(crv);

        return vehicles;
    }
}
