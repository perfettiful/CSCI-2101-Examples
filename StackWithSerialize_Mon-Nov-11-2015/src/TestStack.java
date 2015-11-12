import java.util.Stack;

public class TestStack {
  
  static public void main(String[] args) {
    Stack<Integer> aStack = new Stack<Integer>();
    Integer item;
    if (aStack.empty()) {
      System.out.println("The stack is empty");
    } // end if
  
    for (int i = 0; i < 5; i++) {
      aStack.push(i); // With autoboxing, this is the same
                      // as aStack.push(new Integer(i))
    } // end for
  
    while (!aStack.empty()) {
      System.out.print(aStack.peek()+ " ");
      item = aStack.pop();
    } // end while
    System.out.println();
    
  } // end main
  
} // end TestStack
