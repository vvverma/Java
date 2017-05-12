/*
* 	Testing the functionality of static members and variables
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

public class Static
{
	public static void main (String ...args)
	{
		int x = 5;
		Static s = new Static();
		s.doStuff(x);
		System.out.print("main x = "+x);
		new Static().go(1,"hi");
		new Static().go(2,"hi","world");
	}
	
	void doStuff(int x)
	{
		System.out.print("do Stuff x = "+ x++);
	}
	
	//Var-args should be the last one in the parameter list
	public void go(int x,String ...y)
	{
		System.out.print(y[y.length-1]+" ");
	}

}
