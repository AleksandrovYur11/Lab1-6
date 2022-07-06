package org.Itmo.java.lesson6.Task45;

public class AppleTree extends Tree {

    protected Integer numberApple;

    public AppleTree(Double height, Integer numberApple, Integer yearsTree, Double idTree) {
        super(height, yearsTree, idTree);
        this.numberApple = numberApple;
    }

    public void setNumberApple(Integer numberApple) {
        this.numberApple = numberApple;
        System.out.println("Количество яблок: " + this.numberApple);
    }

    public Integer getNumberApple() {
        System.out.println("Количество яблок: " + this.numberApple);
        return numberApple;
    }

    // Метод изменяет поле в главном классе, а также выводит на экран переменную
    public void setYearsTree() {
        super.yearsTree = scanner.nextInt();
        System.out.printf("Яблоне %d лет(год)\n", super.yearsTree);
    }

    // Метод получения имени (id) дерева
    public Double getIdTree() {
        System.out.println("id Яблони: " + super.idTree);
        return super.idTree;
    }
}
