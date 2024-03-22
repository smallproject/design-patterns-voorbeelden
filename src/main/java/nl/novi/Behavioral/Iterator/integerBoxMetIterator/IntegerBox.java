package nl.novi.Behavioral.Iterator.integerBoxMetIterator;

import java.util.ArrayList;
import java.util.List;

class IntegerBox {
    private List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public List<Integer> getList() {
        return list;
    }

    public Iterator getIterator() {
        return new Iterator(this);
    }
}
