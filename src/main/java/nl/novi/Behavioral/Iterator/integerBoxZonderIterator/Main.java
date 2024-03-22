package nl.novi.Behavioral.Iterator.integerBoxZonderIterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntegerBox box = getIntegerBox();
        List<Integer> integerList = box.getData();
        System.out.println("size of data is: " + integerList.size());
        for (Integer anInteger : integerList) {
            System.out.print(anInteger + "  ");
        }
        System.out.println();

        // clear() is een methode van List, maar kan hier "per ongeluk" worden aangeroepen
        // waardoor de integriteit van IntegerBox wordt geschaad.
        integerList.clear();
        integerList = box.getData();
        System.out.println("size of data after accidental 'clear()' is: " + integerList.size());
    }

    private static IntegerBox getIntegerBox(){
        IntegerBox box = new IntegerBox();
        for (int i = 9; i > 0; --i) {
            box.add(i);
        }
        return box;
    }
}
