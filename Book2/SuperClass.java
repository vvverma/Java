/*
* This program is written to understand the concept of superclass constructor
* behaviour
* Rules for superclass constructor
* 1)Every constructor invokes default constructor of the superclass unless
* called by this or super
* 2)If subclass constructor wants to call superclass constructor then then 
* super() - > DC
* super(par) ->PC
* the above two must be the first statement
* 
* 3)If subclass method want to call superclass method then
* super.methodname() - for no para
* super.methodname(para) - for para
* can be anywhere in subclass
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class SuperClass
{
	//Creating default constructor 
	
	SuperClass(int a )
	{
		System.out.println("I am Default Constructor of SuperClass");
	}
}

class Constructor extends SuperClass
{
	//Creating default constructor 
	Constructor(int a)
	{
		//super(5);
		System.out.println("I am Default Constructor of COnstructorClass");
	}

}

class SuperClassTest
{
	public static void main (String ...args)
	{
		//SuperClass supObj = new SuperClass(5);
		Constructor conObj = new Constructor(5);


	}
}
