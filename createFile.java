import java.io.*;
class createFile 
{

	public static void main(String[] args) throws IOException {   
		
		
	    File f=new File ("C:\\Users\\sujoy\\OneDrive\\Desktop\\java.text");
		
		
			if(f.createNewFile())
			{
				System.out.print("File successfully create..!");
			}
			else
			{
				System.out.print("File already Exit..!");
			}
			
		
	}

}
