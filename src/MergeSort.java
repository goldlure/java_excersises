class MergeSort extends Sorter{
    String order;
    @Override
    <T extends Comparable<T>> void sort(T[] values, String order){
        this.order = order;
        System.out.println("Merge "+ this.order);
        sortByMerge(values, 0, values.length-1);
    }
    private <T extends Comparable<T>> void sortByMerge(T[] values, int left, int right){
        if (right > left){
            int middle =(right+left)/2;
            sortByMerge(values, left, middle);
            sortByMerge(values, middle+1, right);
            merge(values, left, middle, right);
        }
    }
    private <T extends Comparable<T>> void merge(T[] values, int left, int middle, int right){
        int sizeLeft = middle - left +1;
        int sizeRight = right - middle;

        T[] valuesLeft  = (T[]) new Comparable[sizeLeft];
        T[] valuesRight = (T[]) new Comparable[sizeRight];

        for (int i = 0; i <sizeLeft; i++){
            valuesLeft[i] = values[left+i];
        }
        for (int j = 0; j <sizeRight; j++){
            valuesRight[j] = values[middle+1+j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < sizeLeft && j < sizeRight){
            if (valuesLeft[i].compareTo(valuesRight[j])<=0){
                values[k] = valuesLeft[i];
                i++;
            } else {
                values[k]= valuesRight[j];
                j++;
            }
            k++;
        }
        while (i <sizeLeft){
            values[k] = valuesLeft[i];
            i++;
            k++;
        }
        while(j <sizeRight){
            values[k] = valuesRight[j];
            j++;
            k++;
        }
    }
}