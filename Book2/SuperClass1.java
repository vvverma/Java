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
* super() -> between the class
* this() -> within 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class SuperClass
{
	//Creating default constructor 
	
	SuperClass()
	{
		
		System.out.println("I am Default Constructor of SuperClass1");
	}
	SuperClass(int a)
	{
	
	System.out.println("I am Default Constructor of SuperClass2");
	}



}

class Constructor extends SuperClass
{
	//Creating default constructor 
	Constructor()
	{
		super(5);		
			System.out.println("I am Default Constructor of COnstructorClass1");
	}
	Constructor(int a)
	{
	//	this();		
		System.out.println("I am Default Constructor of COnstructorClass2");
	}
}

class SuperClassTest1
{
	public static void main (String ...args)
	{
		SuperClass supObj = new SuperClass();
		System.out.println(" ");	
		Constructor conObj = new Constructor();
		System.out.println(" ");	
		SuperClass supObj1 = new SuperClass(5);
		System.out.println(" ");	
		Constructor conObj1 = new Constructor(5);

	
	}
}
