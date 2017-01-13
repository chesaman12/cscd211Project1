package cscd211Methods;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import cscd211Classes.Sandwich;
import cscd211Utils.ArrayUtils;

public class Lab1Methods {
	public static int menu(Scanner kb)
	{
		int input = 0;
		//do{
			System.out.println("1. Print the array to the screen");
			System.out.println("2. Sort the array based on the natural order");
			System.out.println("3. Sort the array by imposing a total order");
			System.out.println("4. Print the array to a file");
			System.out.println("5. Quit the program");
			System.out.println("");
			System.out.println("Enter an int between 1 and 5: ");
			input = kb.nextInt();
			
			kb.
			
			
			if(input > 5 || input < 1 )
				throw new IllegalArgumentException("Please enter a valid int");
		//}while(input != 5);
		

		
		return input;
	}

	public static Sandwich[] fillArray(Scanner fin) {

		if (fin == null)
			throw new IllegalArgumentException("No File");
		Sandwich[] array = null;
		while (fin.hasNext()) {
			if (array == null) {
				array = new Sandwich[fin.nextInt()];
			}
			
			//throughout the rest of the outer loop, read each line and put it into a variable to read sandwich data
			
			fin.nextLine();
		}
	}

}
