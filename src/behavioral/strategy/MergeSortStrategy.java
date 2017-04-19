package behavioral.strategy;

public class MergeSortStrategy<T extends Comparable<T>> implements ISortStrategy<T> {
    private static <T extends Comparable<T>> void merge(T[] result_array, T[] left_array, T[] right_array) {
        int left_index = 0, right_index = 0, k = 0;
        for (; left_index < left_array.length && right_index < right_array.length; ++k) {
            if (left_array[left_index].compareTo(right_array[right_index]) < 0) {
                result_array[k] = left_array[left_index++];
            } else {
                result_array[k] = right_array[right_index++];
            }
        }
        for (; left_index < left_array.length; ++k) {
            result_array[k] = left_array[left_index++];
        }
        for (; right_index < right_array.length; ++k) {
            result_array[k] = right_array[right_index++];
        }
    }

    @Override
    public void sort(T[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        T[] left_array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), mid);
        System.arraycopy(array, 0, left_array, 0, mid);

        int right_array_length = array.length - mid;
        T[] right_array = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), right_array_length);
        System.arraycopy(array, mid, right_array, 0, right_array_length);

        this.sort(left_array);
        this.sort(right_array);
        merge(array, left_array, right_array);
    }
}
