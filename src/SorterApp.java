class SorterApp {
    protected void run() {
        sort(new Integer[] { 1, 2, 3, 4, 5 });
        sort(new Integer[] { 7, 0, 4, 444, 67 });
        sort(new Integer[] { 5, 4, 3, 2, 1 });

        System.out.println();

        sort(new String[] { "a", "b", "c", "d", "e" });
        sort(new String[] { "c", "a", "e", "d", "b" });
        sort(new String[] { "e", "d", "c", "b", "a" });

        Student s1 = new Student(18, "s1", 45);
        Student s2 = new Student(19, "s2", 40);
        Student s3 = new Student(17, "s3", 55);

        sort(new Student[] {s1,s2,s3});
        
    }
    private <T extends Comparable<T>> void sort(T[] values) {
        BubbleSort bubbleSorter = new BubbleSort();
        bubbleSorter.sortAscending(values);
        Utils.printArray(values);
        bubbleSorter.sortDescending(values);
        Utils.printArray(values);
    }
}