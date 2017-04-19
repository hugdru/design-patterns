package behavioral.strategy;

interface ISortStrategy<T extends Comparable<T>> {
    void sort(T[] t);
}