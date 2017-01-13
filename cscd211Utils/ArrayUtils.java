package cscd211Utils;

import java.io.PrintStream;

public class ArrayUtils {
	public static void printArray(Comparable[] array)
	{
		if(array == null || array.length < 1)
			throw new IllegalArgumentException("Array is empty");
		for(int ix = 0; ix < array.length; ix++)
		{
			System.out.println(array[ix]);
		}
	}
	public static void printArray(Comparable[] array, PrintStream fout)
	{
		if(array == null || array.length < 1)
			throw new IllegalArgumentException("Array is empty");
		for(int ix = 0; ix < array.length; ix++)
		{
			fout.println(array[ix]);
		}
	}
	
	public static void selectionSort(Comparable[] array)
	{
		int start, search, min;
		Comparable temp;
		for(start = 0; start < array.length - 1; start++)
		{
			min = start;
			for(search = start+1; search < array.length; search++)
				if(array[search].compareTo(array[min]) < 0)
					min = search;
		
			temp = array[start];
			array[start] = array[min];
			array[min] = temp;
		}
	}
}
