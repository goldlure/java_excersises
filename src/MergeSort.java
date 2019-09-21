class MergeSort {
    String order;
    void sortInt(Integer[] values, String order){
        this.order = order;
        System.out.println("Merge "+ this.order);
        sortByMerge(values, 0, values.length-1);
    }
    private void sortByMerge(Integer[] values, int left, int right){
        if (right > left){
            int middle =(right+left)/2;
            // System.out.println(middle);
            sortByMerge(values, left, middle);
            sortByMerge(values, middle+1, right);
            // System.out.println(left + ", "+middle+", "+right);
            merge(values, left, middle, right);
        }
    }
    private void merge(Integer[] values, int left, int middle, int right){
        int sizeLeft = middle - left +1;
        int sizeRight = right - middle;

        Integer[] valuesLeft =new Integer[sizeLeft];
        Integer[] valuesRight =new Integer[sizeRight];

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
            if ((valuesLeft[i]<valuesRight[j]) == this.order.equals("asc")){
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
        while(j < sizeRight){
            values[k] = valuesRight[j];
            j++;
            k++;
        }
    }
}