class QuickSort extends Sorter{
    
    String order;
    @Override
    <T extends Comparable<T>> void sort(T[] values, String order){
        this.order = order;
        System.out.println("QUICK "+ this.order);
        sortByPivot(values, 0, values.length-1);
    }
    private <T extends Comparable<T>> void sortByPivot(T[] values, int low, int high){
        if (low < high) {
            int pivot = setPivot(values, low, high);
            sortByPivot(values, low, pivot-1);
            sortByPivot(values, pivot + 1, high);
        }
    }

    private <T extends Comparable<T>> int setPivot(T[] values, int low, int high){
        T pivot = values[high];
        int i = low-1;
        for (int j = low; j < high; j++){
            if ((values[j].compareTo(pivot) < 0)==this.order.equals("asc")){
                i++;
                swap(values, j, i);
            }
        }
        swap(values, i+1, high);
        return i + 1;
    }
}