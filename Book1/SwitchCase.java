/*
* Write a program to test switch case statement
* 
* Syntax - 
* 		switch(int/byte/char/short)
* 		{
* 		case a : 
* 				break; // important to wirte this statment;
* 		case b : break;
* 		default : ....
* 		}
* 		
* 		like for loop we cannot declare a variable inside the 
* 		switchcase condition 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/
class SwitchCase
{
	public static void main(String ...args)
	{
		int a= Integer.parseInt(args[0]);
		
		switch (a)
		{
		case 1:
				System.out.println("I am case 1");
				break; // make efficient use of break
		case 2:
				System.out.println("I am case 2");
		default:
				System.out.println("I am case default");
						
		case 3:
				System.out.println("I am case 3");
		
		
		
		}
	
	}


}
