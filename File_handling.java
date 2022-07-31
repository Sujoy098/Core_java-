//import java.io.*;
//class File_handling {
//
//	public static void main(String[] args) {
//		File_handling f=new File_handling("C:\\Users\\\\sujoy\\OneDrive\\Desktop\\java.text");
//		try
//		{
//			if(f.createNewFile())
//			{
//				System.out.print("File successfully create..!");
//			}
//			else
//			{
//				System.out.print("File already Exit..!");
//			}
//		
//		}
//		catch(IOException i)
//		{
//			System.out.print("File already Exit..!");
//		}
//		
//
//	}
//
//}

//import java.io.*;
//class createFile {
//
//	public static void main(String[] args) {
//	File f=new File("C:\\Users\\sujoy\\OneDrive\Desktop\\java.text");
//		
//		try
//		{
//			if(f.createNewFile())
//			{
//				System.out.print("File successfully create..!");
//			}
//			else
//			{
//				System.out.print("File already Exit..!");
//			}
//		
//		}
//		catch(IOException)
//		{
//			System.out.print("File already Exit..!");
//		}
//		
//	}
//
//}
import java.io.*;
class filewriter {

	public static void main(String[] args) {
		try
		{
		    filewriter f=new filewriter ("C:\\Users\\sujoy\\OneDrive\Desktop\\java.text");
		
		   try
		   {
		       f.write("Java programming is the best language..!")
		   }
		   finally
		   {
		       f.close();
		   }
		   	System.out.print("File successfully create..!");
			
		}
		catch(IOException i)
		{
			System.out.print(i);
		}
		
	}

}



