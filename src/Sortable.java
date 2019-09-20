interface Sortable {
    <T extends Comparable<T>> void sortAscending(T[] values, String type);
    <T extends Comparable<T>> void sortDescending(T[] values, String type);
  }