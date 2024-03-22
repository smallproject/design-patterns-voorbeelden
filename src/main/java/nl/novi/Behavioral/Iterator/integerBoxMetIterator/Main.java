package nl.novi.Behavioral.Iterator.integerBoxMetIterator;

public class Main {
    public static void main(String[] args) {
        IntegerBox box = getIntegerBox();
        Iterator iter = box.getIterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    private static IntegerBox getIntegerBox(){
        IntegerBox box = new IntegerBox();
        for (int i = 9; i > 0; --i) {
            box.add(i);
        }
        return box;
    }
}
