package org.Itmo.java.lesson3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;


    Tree(int age, boolean alive, String name){
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    Tree(int age,  String name){
        this.age = age;
        this.name = name;
    }

    Tree(){
       System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", alive=" + alive +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args){
        Tree tree1 = new Tree (21, true , "Сосна");
        System.out.println(tree1.toString());
        Tree tree2 = new Tree (41,"Дуб");
        System.out.println(tree2.toString());
        Tree tree3 = new Tree ();
    }

}
