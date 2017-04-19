package behavioral.strategy;

class Sorter<T extends Comparable<T>> {
    private ISortStrategy sortStrategy;

    Sorter(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    void sort(T[] array) {
        this.sortStrategy.sort(array);
    }

    void setSortStrategy(ISortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
