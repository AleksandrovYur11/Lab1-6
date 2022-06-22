package org.Itmo.java.lesson2;

public class Animals {
    private Type type;
    private String nameAnimals;

    public Animals(){

    }

    public Animals(Type type, String nameAnimals){
        this.type = type;
        this.nameAnimals = nameAnimals;
    }

    public String getNameAnimals() {
        return nameAnimals;
    }

    public void setNameAnimals(String nameAnimals) {
        this.nameAnimals = nameAnimals;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type=" + type +
                ", nameAnimals='" + nameAnimals + '\'' +
                '}';
    }

    public static void main(String[] arg){
        Animals ZooAnimals1 = new Animals(Type.Mammal, "Elephant");
        System.out.println(ZooAnimals1.toString());
        System.out.println(ZooAnimals1.getNameAnimals());
        System.out.println(ZooAnimals1.getType());
        ZooAnimals1.setNameAnimals("Hog");
        System.out.println(ZooAnimals1.toString());

        Animals ZooAnimals2 = new Animals();
        System.out.println(ZooAnimals2.toString());
        System.out.println(ZooAnimals2.getNameAnimals());
        ZooAnimals2.setNameAnimals("Shark");
        System.out.println(ZooAnimals2.toString());
    }


}
