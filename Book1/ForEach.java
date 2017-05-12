/*
* 	Write a program to add elements of two same sized arrays using for each loop
* 	1)feed the array
* 	2) Compute the addition element by element
* 	3) Store the result in final array 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class ForEach
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		//printing the array using forEach
		for(int i: arr)
		System.out.println(i + " ");
		System.out.println("  ");		
		//printing reverse using for loop
		for (int j = arr.length;j>-1;j--)
		System.out.println(j + " ");
	
	}


}
