import java.io.*;

public class StackSerialTest {
  public static void main(String[] args){
    StackReferenceBased awesomeStack = null;
    try {
    	
    	File myFile = new File("stackText.txt");
    	FileReader fr = new FileReader(myFile);
    	BufferedReader reader = new BufferedReader(fr);
    	
    	String line = null;
    	
    	while ((line = reader.readLine()) != null) {
    		System.out.println(line);
    	}
    	
    	reader.close();
    	
    	System.out.println("Now, moving ontot he serialized stuff...");
    	
    FileInputStream fileStream = new FileInputStream("Stack.ser");
    ObjectInputStream stream = new ObjectInputStream(fileStream);
    Object blah = stream.readObject();
    awesomeStack = (StackReferenceBased) blah;
    stream.close();
    System.out.println(awesomeStack.peek());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    awesomeStack.push(1233);
    System.out.println(awesomeStack.peek());
    System.out.println(awesomeStack.returnThree());
  }

}