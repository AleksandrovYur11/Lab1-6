package org.Itmo.java.lesson6.Task45;

import java.util.Scanner;

public class Tree {

    protected Integer yearsTree;
    protected Double height;
    protected Double idTree;                    // В садах Греции каждое плодосное дерево имеет свой ID-номер (название)
    Scanner scanner = new Scanner(System.in);

    public void getTreeInfo() {
        System.out.printf("Дереву %d лет(год)\n", yearsTree);
    }

    public void getHeight() {
        System.out.println("Высота дерева: " + this.height + " м");
    }

    public Tree(Double height, Integer yearsTree, Double idTree) {
        this.height = height;
        this.yearsTree = yearsTree;
        this.idTree = idTree;
    }
}

