/*
This program demonstarates about exception and its handling

Use--
To avoid the program from ending abruptly and continue with the remaining 
code.

Concept--
Exception is an abnormal condition that arises in a code sequence during the
runtime.
Exception Hierrarchy is as follows-
			Object
			  |
			Exception
			/        \
		       /          \
         Runtime(Unchecked)      IOexception(Checked)	

	 1)NullPointer		 1)FileNotFound	
	 2)ClassCasting		 2)EOF
	 3)Ilegal Argument
	 4)Illegal State
	 5)NegativeArray Index
         6)Index out of bound
         7)Arithmetic 
	 8)IllegalMonitorState
	 9)ArrayStoreException

Exception Handling- 
1)try
2)catch
3)throw
4)throws
5)finally

Related files --
ExceptionClass.java
This program we will handle exception using try-catch -finally or try and finally
For try catch there is a compulsion to have a catch block
*/


class ExceptionClassFinally{

public static void main(String ...args){

try{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = a/b;
System.out.println("Result = "+ c);
} 
/* catch(ArithmeticException e){
 System.out.println("Attempt to divide by 0");
 e.printStackTrace();
}
catch(NumberFormatException e){
 System.out.println("Wrong Data Type");
 e.printStackTrace();
}
catch(ArrayIndexOutOfBoundsException e){
 System.out.println("Array Index Out Of Bound");
 e.printStackTrace();

}
catch(Exception e){
 System.out.println("Handled by default");
 e.printStackTrace();
} */
//if above all catch statements are removed then the exception is handled
// by JVM  
finally{
 System.out.println("In finally block");
/* 
System.exit(1);
return statement 
exception in finally block 
All these can stop the execution of the finally block
*/
}
}
}