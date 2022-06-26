package org.Itmo.java.lesson3;

public class Car {
    private Color color;
    private String name;
    private double weight;

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    Car(Color color){
        this.color = color;
    }

    Car(Color color, double weight){
        this.color = color;
        this.weight = weight;
    }

    Car(){

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public static void main(String[] args){
        Car Car1 = new Car(Color.GREEN);
        Car Car2 = new Car(Color.WHITE, 2231.242);
        System.out.println(Car1.toString());
        System.out.println(Car2.toString());
        Car1.setName("BMW");
        Car1.setWeight(1543.214);
        Car2.setName("LADA");
        System.out.println("---------------------------------------------");
        System.out.println(Car1.toString());
        System.out.println(Car2.toString());
    }

}
