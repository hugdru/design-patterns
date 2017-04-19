package behavioral.iterator.iterable;

import java.util.Iterator;

class MyArrayCollection implements Iterable<String> {
    String[] array;

    public MyArrayCollection(String[] strings) {
        array = strings.clone();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < array.length;
            }

            @Override
            public String next() {
                return array[i++];
            }
        };
    }
}
