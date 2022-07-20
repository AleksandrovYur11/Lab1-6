package org.Itmo.java.lesson7;

import java.util.Scanner;

public class Plane {

    Scanner in = new Scanner(System.in);

    private String model;
    private String name;
    private Wing wing;

    Plane(String model, String name) {
        this.model = model;
        this.name = name;
        this.wing = new Wing();
    }

    class Wing {

        private Double weight;

        public Wing(Double weight) {
            this.weight = weight;
        }

        public Wing() {

        }

        public void showWeight() {
            System.out.println("Wing weight: " + weight + " kg");
        }

        public void setWeight(Double weight) {
            this.weight = weight;
        }
    }

    public Wing getWing() {
        return wing;
    }

    public void planeShowInfo() {
        wing.showWeight();
        System.out.println("Model PLane: " + model);
        System.out.println("Name PLane: " + name);
    }
}
