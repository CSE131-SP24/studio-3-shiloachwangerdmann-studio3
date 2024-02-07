package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("How big bitch?");
	int n = in.nextInt();
	
	boolean[] array = new boolean[n];
	for (int i = 0; i < array.length; i++) 
	{
		array[i] = true;
		//System.out.println(array[i]);
	}
	
	int multiple = 2;
	while (multiple <= Math.sqrt(n))
	{
		System.out.println("Multiple: " + multiple);
		for (int arrayNumber = multiple*2; arrayNumber < array.length; arrayNumber += multiple)
		{
			array[arrayNumber] = false;
			/*if (arrayNumber == multiple)
			{
				array[arrayNumber] = true;
			}*/
		System.out.println("Array number: " +  arrayNumber);	
		}
		multiple++;
	}
	for (int i = 0; i < array.length; i++)
	{
		//System.out.println(array[i]);
		if (array[i] == true && (i != 0 && (i != 1 && i != 4)))
		{
			System.out.println(i);
		}
	}
	
	
	
	
	/*int[] array = new int[n];
	for (int i = 0; i < array.length; i++) 
	{
		array[i] = i + 1;
		//System.out.println(array[i]);
	} */

	}

}
