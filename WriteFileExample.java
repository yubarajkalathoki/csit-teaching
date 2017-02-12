import java.io.*;
public class WriteFileExample{
	public static void main(String[] args){
		try{
		     FileWriter fw = new FileWriter("abc.txt");
		     String s="Sachin Tendulkar is my favourite player";
		     fw.write(s);
		     fw.close();
		     System.out.println("success...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}