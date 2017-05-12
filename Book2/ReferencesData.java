/*
* In this program we are going to demostrate reference data and methods
* Supppose 
* A is the superclass and B extends A where B is a subaclass
* Then
* 1) A a = new B() -> This is called polymorphic reference 
* The reference of Class A can refer to objects of A and 
* objects of its sub class B also.
* 
* 2)Reference -> SuperClass
*   Object    -> Subclass
*   Data(overridden) -> SuperClass
*   Methods(overridden) -> SubClass	
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class DataTypes
{
	String message1 = "I am from overriden data memeber";
	String message2 = "I am not overriden data member";
	void show1()
	{
		System.out.println("I am from superclass");	

	}


	void show2()
	{
		System.out.println("I am from superclass(non-overridden)");	

	}

}

class Integers extends DataTypes
{
	String message1 = "I am the overridden message from Integer subclass";
	String message3 = "I am not the overridden message from Subclass";

	void show1()
	{
		System.out.println("I am from subclass");	

	}

	void show3()
	{
		System.out.println("I am from subclass-non-overriden");	

	}


}

class Float extends Integers
{
void show3(){
System.out.println("I am from subclass Float");
}
}

class Double extends Integers
{
void show3(){
System.out.println("I am from subclass Float");
}
}
class ReferencesData
{
	public static void main(String args[])
	{
		
		DataTypes a = new DataTypes(); //Normal Reference
		System.out.println(a.message1);
		System.out.println(a.message2);
	
		a.show1();
		a.show2();
	
		Integers b = new Integers(); // Normal Reference
		System.out.println(b.message1);
		System.out.println(b.message3);
	
		b.show1();
		b.show3();
	
		DataTypes a1 = new Integers(); // Polymorphic reference
		System.out.println(a1.message1);
		System.out.println(a1.message2);
		//System.out.println(a1.message3);//Not overidden so CF
		
		a1.show1();
		a1.show2();
		//a1.show3();//CF
		Float f = new Float();
/* CANNOT CONVERT - CF
		Integers b1 = new DataTypes(); // Polymorphic reference invalid
		b1 = (Integers)f;
		System.out.println(b1.message1);
		System.out.println(b1.message2);
		System.out.println(b1.message3);
		
		b1.show1();
		b1.show2();
		b1.show3();

 @author  Vishal Verma
 @version 1.0
 @since   JDK 1.8.0

*/
Double d = new Double();
		
		//b = f; // UPCASTING float converted to datatype
		//b = d; // double to integer		
		//a = f; // float to data type
		//a = d;// double to data type
		//a = b; // integer to data type
		//b = (Integers)a;
		a = f; // compiles and runs
		f = (Float)a; // as f is a so a is f;
		
	
	}
} 
