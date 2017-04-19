package behavioral.strategy;

class BubbleSortStrategy<T extends Comparable<T>> implements ISortStrategy<T> {
    @Override
    public void sort(T[] array) {
        int limit = array.length - 1;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i < limit; ++i) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    Utils.swap(array, i, i + 1);
                    swapped = true;
                }
            }
            limit -= 1;
        } while (swapped);
    }
}
