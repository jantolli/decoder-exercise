package main.java.upwork.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EncodedList<T> extends ArrayList<T> {

    List<T> digits;

    public EncodedList(List<T> digits) {
        this.digits = digits;
    }

    @Override
    public IteratorDecoder<T> iterator() {
        return new IteratorDecoder<T>();
    }

    class IteratorDecoder<T> implements Iterator {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < digits.size();
        }

        @Override
        public Integer next() {
            return (Integer) digits.get(currentIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}