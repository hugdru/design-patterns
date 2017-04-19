package behavioral.iterator.myIterable;


class MyArrayCollection implements IMyIterable<String> {
    String[] array;

    public MyArrayCollection(String[] strings) {
        array = strings.clone();
    }

    @Override
    public MyIterator<String> iterator() {
        return new MyIterator<String>() {
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
