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
/*Write a program to demonstrate basic concenpts of Classes and Objects*/

class Demo
{
	public static int a; //instance variable
	private static int b;// instance variable
    protected final int c = 200;
	//Default constructor provided by default by the complier
	public Demo()
	{
		System.out.println("Running default CONSTRUCTOR");
		a= 10;
		b= 20;
	}
	//Parameterized constructor
	public Demo(int a, int b)
	{
		System.out.println("Running parameterized CONSTRUCTOR");
		this.a = a;
		this.b = b;
	}
	
	
	//static function
	public static void setInt(int l)
	{
		System.out.println("accessing static from static");
		a = l;
	}

	public static void setInt(int m, int k)
	{
	System.out.println("constructor overloaded ");
		a = m;
		b = k;
	}
	
	
	// non-static function 
	public int getIntA()
	{
		return a;
	}
	
	public int getIntB()
	{
		return b;
	}
	
}

class DemoTwo extends Demo
{
	public DemoTwo(Demo d)
	{
		System.out.println("Acessing the protected data");
		System.out.println(d.c);
	
	}

}


class DemoTest
{
	public static void main(String ...args)
	{
		//creating an object reference and instanstiating it
		Demo d = new Demo();
		DemoTwo d2 = new DemoTwo(d);
		System.out.println(d.getIntA()+" "+d.getIntB());
		Demo d1  = new Demo(13,15);
		System.out.println(d1.getIntA()+" "+d1.getIntB());
		d.setInt(18,19);
		System.out.println(d.getIntA()+" "+d.getIntB());
	}
	
	
}
