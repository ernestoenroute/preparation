package com.enroute.serializationexample;

import com.enroute.vehicles.Vehicle;

import java.io.*;

public class Serializer {

    public void serialize(Object vehicle) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("vehicle.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(vehicle);
            outputStream.close();

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();

            throw e;
        }
    }

    public Vehicle deserialize() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("vehicle.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            final Vehicle vehicle = (Vehicle) inputStream.readObject();

            inputStream.close();
            fileInputStream.close();

            return vehicle;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
