 /* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
* 
*/
/*Write a program to check the working of If loop*/
class Ifloop
{
	public static void main (String ...args)
	{
	//boolean b = false;
	char a = 'a', b = 'a', c= 'b';
	char x = (char) (a ^ b);
	char y = (char) (a ^ a);
	System.out.println(x);
	System.out.println(y);
	
	
/*	
	//inside if loop there should always be a condition
	if(x = 3)// this line will give compilation error
		System.out.println(x);
	else	
		System.out.println(x);
*/	
	//IF any non-negative integer is written inside the loop condition then it 
	//will execute
	if(true)
		System.out.println("0 value executed");
	else if(false)	
		System.out.println("-1 value was executed");
	else if(true)
		System.out.println("non-negative/zero value was executed");
	else 
		System.out.println("default");
	}
}
