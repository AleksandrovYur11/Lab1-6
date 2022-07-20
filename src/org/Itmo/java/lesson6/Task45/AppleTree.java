package org.Itmo.java.lesson6.Task45;

public class AppleTree extends Tree {

    protected Integer numberApple;

    public AppleTree(Double height, Integer numberApple, Integer yearsTree, Double idTree) {
        super(height, yearsTree, idTree);
        this.numberApple = numberApple;
    }

    public void getNumberApple() {
        System.out.println("Количество яблок: " + numberApple);
    }

    @Override
    public void getTreeInfo() {
        super.yearsTree = scanner.nextInt();
        System.out.printf("Имя дерева (id) яблони: %s \n", super.idTree);
    }

    public void setYearsTree() {
        super.yearsTree = scanner.nextInt();
        System.out.printf("Яблоне %d лет(год)\n", super.yearsTree);
    }
}
