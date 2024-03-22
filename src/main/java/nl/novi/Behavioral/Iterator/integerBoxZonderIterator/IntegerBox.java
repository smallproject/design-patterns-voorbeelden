package nl.novi.Behavioral.Iterator.integerBoxZonderIterator;

import java.util.ArrayList;
import java.util.List;

class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public List<Integer> getData() {
        return list;
    }
}
