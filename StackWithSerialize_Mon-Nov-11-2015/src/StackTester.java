import java.io.*;

public class StackTester{

  public static void main(String[] args){
    StackReferenceBased stack = new StackReferenceBased();
    stack.push(42);
    System.out.println(stack.peek());
    try{
    	FileWriter writer = new FileWriter("stackText.txt");
    	writer.write(stack.peek().toString());
    	writer.write("\nThis is from the text file.");
    	writer.close();
    	
    	
    FileOutputStream fileStream = new FileOutputStream("Stack.ser");
    ObjectOutputStream output = new ObjectOutputStream(fileStream);
    output.writeObject(stack);
    output.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    stack.push(100);
    System.out.println(stack.peek());
    
    
    
  }

}
