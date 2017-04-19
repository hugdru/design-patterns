package behavioral.strategy;

class QuickISortStrategy<T extends Comparable<T>> implements ISortStrategy<T> {
    @Override
    public void sort(T[] t) {
        quicksort(t, 0, t.length);
    }

    private void quicksort(T[] array, int start_index, int end_index) {
        if (start_index >= end_index) {
            return;
        }
        int pivot_index = partition(array, start_index, end_index);
        quicksort(array, start_index, pivot_index);
        quicksort(array, pivot_index + 1, end_index);
    }

    private int partition(T[] array, int start_index, int end_index) {
        int pivot_index = end_index - 1;
        T pivot = array[pivot_index];

        int partition_index = start_index;
        for (int i = start_index; i < pivot_index; ++i) {
            if (array[i].compareTo(pivot) < 0) {
                Utils.swap(array, partition_index, i);
                partition_index = partition_index + 1;
            }
        }
        Utils.swap(array, partition_index, pivot_index);
        return partition_index;
    }
}