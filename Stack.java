class Stack <T>{
   private Object[] storage;
   private int length;
   private int top;
   Stack(int size){
        storage = new Object[size];
        length = size;
        top = 0;
   } 
   public void Push(T value){
       if (top == length -1){
            System.out.println("stack is full");
            return;
       }
       storage[top] = value;
       top++;
   }
   public T Peek(){
    if (top == 0){
        System.out.println("stack is empty");
        System.exit(1);
    }
    @SuppressWarnings("unchecked")
    T value = (T)storage[top-1];
    return value;
   }
   public T Pop(){
    T value = Peek();
    top--;
    return value;
   }
   public int getSize(){
       return length;
   }
   public int getTop(){
       return top;
   }
}