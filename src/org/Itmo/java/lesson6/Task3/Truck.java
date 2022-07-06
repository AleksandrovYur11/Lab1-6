package org.Itmo.java.lesson6.Task3;

public class Truck extends Car {
    private Integer numberOfWheels;
    private Double maxwWightCargo;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, double maxwWight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxwWightCargo = maxwWight;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void newWheels(int numberOfWheels) {
        setNumberOfWheels(numberOfWheels);
        System.out.println("Количество колёс: " + numberOfWheels);
    }


}
