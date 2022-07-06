package org.Itmo.java.lesson6.Task12;

public abstract class Human {
    protected String name;
    protected String surName;

    public Human() {
        System.out.println(3);
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    abstract void showHumanInfo();

    public Human(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}

