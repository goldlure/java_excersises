class SorterApp {
    protected void run() {
        sort(new Integer[] { 1, 2, 3, 4, 5 });
        sort(new Integer[] { 3, 1, 5, 4, 2 });
        sort(new Integer[] { 5, 4, 3, 2, 1 });

        System.out.println();

        sort(new String[] { "a", "b", "c", "d", "e" });
        sort(new String[] { "c", "a", "e", "d", "b" });
        sort(new String[] { "e", "d", "c", "b", "a" });
    }
    private <T extends Comparable<T>> void sort(T[] values) {
        Sortable sorter = new BubbleSort();
        sorter.sortAscending(values);
        // sorter.sortDescending(values);
        Utils.printArray(values);
    }
}