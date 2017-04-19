package behavioral.strategy;

class Main {
    public static void main(String[] args) {

        ISortStrategy quickSort = new QuickISortStrategy();
        ISortStrategy bubbleSort = new BubbleSortStrategy();
        ISortStrategy mergeSort = new MergeSortStrategy();

        Sorter sorter = new Sorter(quickSort);
        System.out.println("QuickSort");
        Integer[] integers = new Integer[]{9, 1, 5, 3, 2, 10, 4, 11};
        sorter.sort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        sorter.setSortStrategy(bubbleSort);
        System.out.println("BubbleSort");
        integers = new Integer[]{9, 1, 5, 3, 2, 10, 4, 11};
        sorter.sort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        sorter.setSortStrategy(mergeSort);
        System.out.println("MergeSort");
        integers = new Integer[]{9, 1, 5, 3, 2, 10, 4, 11};
        sorter.sort(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}