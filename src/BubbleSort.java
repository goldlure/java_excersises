class BubbleSort extends Sorter{
    @Override
    <T extends Comparable<T>> void sort(T[] values, String order){
        System.out.println("Bubble "+ order);

        int length = values.length;
        boolean notSwapped;
        for (int i=0; i<length; i++) {
            notSwapped = true;
            for (int j = 1; j<length-i; j++){
                if ((values[j-1].compareTo(values[j])>0)==order.equals("asc")){
                    swap(values, j-1, j);
                    notSwapped = false; 
                    //System.out.println("unsorted up"); 
                } 
            }
            if (notSwapped){
                //System.out.println("sorted");
                break;
            }
        }
    }
}