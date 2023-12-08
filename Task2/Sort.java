public class Sort {
    private SortingStrategy sortingStrategy;

    /**
     * setSortingStrategy.
     */
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    /**
     * sortArray.
     */
    public void sortArray(int[] arr) {
        sortingStrategy.sort(arr);
    }
}
