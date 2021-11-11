package com.enroute.serializationexample;

import com.enroute.vehicles.Brand;
import com.enroute.vehicles.Type;
import com.enroute.vehicles.Vehicle;
import org.junit.Test;

import java.io.IOException;
import java.io.NotSerializableException;

import static org.junit.Assert.*;

public class SerializerTest {

    @Test
    public void serializeDemo() throws IOException, ClassNotFoundException {

        Vehicle vehicle = Vehicle.builder()
                .brand(Brand.NISSAN)
                .type(Type.SUV)
                .model("X-Trail")
                .year(2020)
                .mileage(34567.76f)
                .build();

        Serializer serializer = new Serializer();

        System.out.println(vehicle);
        serializer.serialize(vehicle);

        final Vehicle deserializedVehicle = serializer.deserialize();
        System.out.println("--");
        System.out.println(deserializedVehicle);

        //Objects are not equals because the mileage is marked as transient, so it is not persisted.
        assertNotEquals(vehicle, deserializedVehicle);
    }

    @Test(expected = NotSerializableException.class)
    public void failSerialization() throws IOException {

        Song song = new Song("Hermano lobo", "Alejandro Filio");

        Serializer serializer = new Serializer();

        serializer.serialize(song);
    }

}