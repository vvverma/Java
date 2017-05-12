/*
* Data types in java are  primitive and non-primitive
* 	1)Primitive Data types are numeric and non- numeric
* 		numeric includes - Integer types->{bytes(8bit),short(16bit),int(32 bit),long(64 bit)} Floating types->{float(64 bits),double(64 bits)}
* 		non-numeric includes - char(16bit), boolean(32 bit)
* 	2)Non-primitive Data types includes - > class, interface array. String is a class.
* 
* In this program, type conversion is performed to understand the concept of narrowing conversions and widening conversions.
* The list given below denotes the widening conversions.
* 1)char
* 2)bytes
* 3)short	
* 4)int
* 5)long
* 6)float
* 7)double
* 
* In order to convert data type bottom to top in the above given list we need to perform type casting
* 
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class Cast
{
	public static void main(String args[])
	{
		System.out.println("Automatic type conversion i.e Broadening conversion");
		char var = 'A';
		int toInt = var;
		System.out.println("Type cast from char to Interger "+ var + " to integer "+ toInt);
	
		System.out.println("Automatic type conversion i.e Norrowing conversion");		   
		toInt = 65;
		var = (char) toInt;
		System.out.println("Type cast from char to Interger "+ toInt+ " to integer "+ var);
		
	}
	

}
