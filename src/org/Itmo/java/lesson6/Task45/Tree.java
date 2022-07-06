package org.Itmo.java.lesson6.Task45;

import java.util.Scanner;

public class Tree {

    protected Integer yearsTree;
    protected Double height;
    protected Double idTree;                    // В садах Греции каждое плодосное дерево имеет свой ID-номер (название)
    Scanner scanner = new Scanner(System.in);

    public void setYearsTree() {
        this.yearsTree = scanner.nextInt();
        System.out.printf("Дереву %d лет(год)\n", yearsTree);
    }
    // Метод получения возраста дерева
    public Integer getYearsTree() {
        System.out.printf("Дереву %d лет(год)\n", yearsTree);
        return yearsTree;
    }

    public Double getHeight() {
        System.out.println("Высота дерева: " + this.height + " м");
        return height;
    }

    public Double getIdTree() {
        System.out.println("id Дерева: " + this.idTree);
        return idTree;
    }

    public Tree(Double height, Integer yearsTree, Double idTree) {
        this.height = height;
        this.yearsTree = yearsTree;
        this.idTree = idTree;
    }
}

