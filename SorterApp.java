public class SorterApp {
    protected void run() {
        sort(new Integer[] {});

    }
    private <T extends Comparable<T>> void sort(T[] values) {
        Sortable sorter = new BubbleSort();
        
    }
}