import java.io.*;
public class ReadFileExample{
	public static void main(String[] args)throws IOException{
		try{
		     FileInputStream fis=new FileInputStream("abc.txt");
		     int i = 0;
		     while((i=fis.read())!=-1){
				 System.out.print((char)i);
			}
			fis.close();
		     System.out.println("Success...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}