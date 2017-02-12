import java.io.*;
public class ReadFileExample{
	public static void main(String[] args)throws IOException{
		try{
		     FileReader fr=new FileReader("abc.txt");
		     int i = 0;
		     while((i=fr.read())!=-1){
				 System.out.print((char)i);
			}
			fr.close();
		     System.out.println("Success...");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}