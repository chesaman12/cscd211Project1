package cscd211Utils;

import java.io.File;
import java.util.Scanner;

public class FileUtils 
{
	public static File openFile(final String role, final Scanner kb){

		if(role == null || role.isEmpty() || kb == null)
			throw new IllegalArgumentException("File is empty");

		File inf;
		do
		{
			System.out.println("Please enter file name " + role + " file");
			String fn = kb.nextLine();
			inf = new File(fn);
		}while(!inf.exists() && !inf.canRead()); 
		return inf;
		
	}
}
