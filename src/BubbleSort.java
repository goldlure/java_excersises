class BubbleSort extends Sorter implements Sortable{
    @Override
    public <T extends Comparable<T>> void sortAscending(T[] values){
        sort01(values,"asc");
    }
    @Override
    public <T extends Comparable<T>> void sortDescending(T[] values){
        sort01(values,"desc");
    }

    private <T extends Comparable<T>> void sort01(T[] values, String order){
        int length = values.length;
        boolean notSwapped;
        // for(int i = 1; i < length; i++){
        //     for (int j = 0; j < length-i; j++){
        //         if (values[j + first].compareTo(values[second]) > 0){
        //             swap(values, j+first, j+second);
        //         }
        //     }
        // }
        for (int i=0; i<length; i++) {
            notSwapped = true;
            for (int j = 1; j<length-i; j++){
                if (values[j-1].compareTo(values[j])>0 && order.equals("asc")){
                    swap(values, j-1, j);
                    notSwapped = false; 
                    System.out.println("unsorted up"); 
                } 
                else if (values[j-1].compareTo(values[j])<0 && order.equals("desc")){
                    swap(values, j-1, j);
                    notSwapped = false;  
                    System.out.println("unsorted down");
                } 
                
            }
            if (notSwapped){
                System.out.println("sorted");
                break;
            }
        }
    }
}