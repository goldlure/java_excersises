public class test1 {   
   public static void main(String[] args) {
      {
      // Stack<Integer> stack  = new Stack(10);
      // System.out.println(stack.getTop());
      // stack.Push(90);
      // System.out.println(stack.Peek());
      // stack.Push(91);
      // System.out.println(stack.Peek());
      // stack.Push(92);
      // System.out.println(stack.Peek());
      // stack.Pop();
      // System.out.println(stack.Peek());
      // stack.Pop();
      // System.out.println(stack.Peek());
      // System.out.println("Hello, world!");
      // Stack<String> stackStr  = new Stack(10);
      // System.out.println(stackStr.getTop());
      // stackStr.Push("90 string");
      // System.out.println(stackStr.Peek());
      // stackStr.Push("91 string");
      // System.out.println(stackStr.Peek());
      // stackStr.Push("92 string");
      // System.out.println(stackStr.Peek());
      // stackStr.Pop();
      // System.out.println(stackStr.Peek());
      // stackStr.Pop();
      // System.out.println(stackStr.Peek());
      // stackStr.Pop();
      // System.out.println(stackStr.Peek());
      }
      
      int arr[] ={3,60,35,2,45,320,5};  
      Sort.bubbleSort(arr); 
      for(int i=0; i < arr.length; i++){  
         System.out.print(arr[i] + " ");  
      }
      System.out.println();
      SorterApp app = new SorterApp();
      app.run();  
   }
}