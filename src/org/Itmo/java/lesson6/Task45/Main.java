package org.Itmo.java.lesson6.Task45;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(12.3D, 24, 123456D);
        tree.setYearsTree();
        tree.getIdTree();
        System.out.println("");
        AppleTree appleTree = new AppleTree(5.2D, 576, 32, 098765D);
        appleTree.setYearsTree();
        appleTree.getIdTree();
    }
}
