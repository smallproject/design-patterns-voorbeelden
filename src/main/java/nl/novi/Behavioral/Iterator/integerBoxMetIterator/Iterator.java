package nl.novi.Behavioral.Iterator.integerBoxMetIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class Iterator {
    private IntegerBox box;
    private List<Integer> cache;
    private int NEXT;
    private int value;

    public Iterator(IntegerBox integerBox) {
        box = integerBox;
        cache = box.getList();
        NEXT = 0;
        value = 0;
    }


    public int next() {

        if(!hasNext()){
            throw new NoSuchElementException();
        } else{
            value = cache.get(NEXT);
            NEXT++;
        }
        return value;
    }

    public boolean hasNext() {
        return NEXT < cache.size();
    }
}