//import java.io.*;
// class filewriter {
//
//	public static void main(String[] args) throws IOException{
//		
//		File f=new File("C:\\Users\\sujoy\\OneDrive\\Desktop\\java.text");
//			try
//			{
//				  f.write("java programming is the best language...!");
//			}
//			finally
//			{
//				 f.close();
//			}
//		
//	}
//}
import java.io.*;
 class fileReader {

	public static void main(String[] args) throws IOException{
		
		FileReader f=new 	FileReader("C:\\Users\\sujoy\\OneDrive\\Desktop\\java.text");
				  f.write("java programming is the best language...!");
				  int i;
		while((i=r.read())!=-1)
		{
		    System.out.print((char)i);
		}
	}
}
