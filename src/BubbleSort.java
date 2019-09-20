class BubbleSort extends Sorter implements Sortable{
    @Override
    public <T extends Comparable<T>> void sortAscending(T[] values){
        sort01(values,0,1);
    }
    @Override
    public <T extends Comparable<T>> void sortDescending(T[] values){
        sort01(values,1,0);
    }

    private <T extends Comparable<T>> void sort01(T[] values, int first, int second){
        int length = values.length;
        
        for(int i = 1; i < length; i++){
            for (int j = 0; j < length-i; j++){
                if (values[j + first].compareTo(values[second]) > 0){
                    swap(values, j+first, j+second);
                }
            }
        }
    }
}