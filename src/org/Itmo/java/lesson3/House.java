package org.Itmo.java.lesson3;


public class House {
    private int numbersFloors;
    private int yearsConstruction;
    private String title;

    House(int numbersFloors, int yearsConstruction, String name){
        this.numbersFloors = numbersFloors;
        this.yearsConstruction = yearsConstruction;
        this.title = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "numbersFloors=" + numbersFloors +
                ", yearsConstruction=" + yearsConstruction +
                ", title='" + title + '\'' +
                '}';
    }

    // Метод для установки всех значений
    public static House newHouse(int numbersFloors, int yearsConstruction, String name){
        return new House(numbersFloors, yearsConstruction, name);
    }

    // Метод для вывова всех значений
    public static void newHousePrintln(House newHouse){
        System.out.println(newHouse);
    }

    // Метод, возвращающий количесвто лет с момента постройки
    public static void yearHome(House house){
        int year = 2022 - house.yearsConstruction;
        System.out.println("Лет с начала постройки: " + year);
    }


    public static void main(String[] args){

       House house1 = newHouse(15,2012,"Улица Строителей д. 12");
       newHousePrintln(house1);
       yearHome(house1);

       House house2 = newHouse(9,2005,"Улица Кораблестроителей д. 15");
       newHousePrintln(house2);
       yearHome(house2);

    }
}
