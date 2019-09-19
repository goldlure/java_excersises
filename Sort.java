public class Sort{
    public static void bubbleSort(int[] arr){
        boolean swapped = true;
        int temp;
        for (int i=0; i<arr.length; i++) {
            if (swapped) {
                for (int j = 1; j<arr.length-i; j++){
                    if (arr[j-1]>arr[j]){
                        temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;  
                        swapped = true;  
                    } else {
                        swapped = false;
                    }
                }
            }
        }
    }
}