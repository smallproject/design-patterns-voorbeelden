package nl.novi.Structural.Decorator.christmastree;

import nl.novi.Structural.Decorator.christmastree.code.*;

public class ChristmasTreeDecoratorMain {
    public static void main(String[] args) {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());

        ChristmasTree tree3 = new BubbleLights(new Garland(new Tinsel(new TreeTopper(new ChristmasTreeImpl()))));
        System.out.println(tree3.decorate());

    }
}
