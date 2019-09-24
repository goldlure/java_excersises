
class RotateArray{
    int[] arr;
    int size;
    public RotateArray(int... args) {
        size = args.length;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = args[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder arrayToString = new StringBuilder();
        for (int i = 0; i < this.size -1 ; i++) {
            arrayToString.append(arr[i]+", ");
        }
        arrayToString.append(arr[this.size -1]);
        return "{" +
            " arr='" + arrayToString + "'" +
            "}";
    }  
    public void rotateRight(int shift){
        //create temporar array to save replaced elements
        int[] tempArr = getTempArr(shift, this.size - shift);  
        //shift elements     
        for (int j = this.size -1 - shift; j >=0 ; j--){
            this.arr[j+shift] = this.arr[j];
        }
        //copy back saved elements
        for (int k = 0; k < tempArr.length; k++){
            this.arr[k] = tempArr[k];
        }
    }
    public void rotateLeft(int shift){
        int[] tempArr = getTempArr(shift, 0);
        
        for (int j = shift; j < this.size ; j++){
            this.arr[j-shift] = this.arr[j];
        }
        for (int k = 0; k < tempArr.length; k++){
            this.arr[this.size - shift + k] = tempArr[k];
        }
    }
    private int[] getTempArr(int shift, int direction){
        int[] tempArr = new int[shift];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = this.arr[direction + i];
        }
        return tempArr;
    }
}