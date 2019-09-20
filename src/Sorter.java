abstract class Sorter implements Sortable{
    public <T extends Comparable<T>> void sortAscending(T[] values){
        sort(values,"asc");
    }
    public <T extends Comparable<T>> void sortDescending(T[] values){
        sort(values,"desc");
    }

    protected <T> void swap(T[] values, int first, int second){
        T temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
    <T extends Comparable<T>> void sort(T[] values, String order){
        System.out.println("no type was choosen");
    }
}