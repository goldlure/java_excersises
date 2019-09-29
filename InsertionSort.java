class InsertionSort extends Sorter{
    @Override
    <T extends Comparable<T>> void sort(T[] values, String order){
        System.out.println("Insertion "+ order);

        int length = values.length;
        for (int i = 1; i < length; i++){
            for (int j = 0; j <length; j++){
                if ((values[i].compareTo(values[j])<0)==order.equals("asc")){
                    //insert in a place
                    insertValue(values, i, j);
                    break;
                }
            }
        }
    }
    private <T extends Comparable<T>> void insertValue(T[] values, int i, int j){
        System.out.println("we should shift from " + values[j] + " and put " + values[i]);
        T temp = values[i];
        for (int k = values.length -1; k > j; k--){
            values[k] = values[k-1];
        }
        values[j] = temp;
    }
}