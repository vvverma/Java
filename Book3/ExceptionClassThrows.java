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

This program we will handle exception using try-catch and throws keyword
For try catch there is a compulsion to have a catch block

throws in Super and Sub classes
1)Method overloading
 -> We can change the exception by an overloaded method
2)Method overriding
 -> For Checked exception
    We can reduce or eliminate the exceptions of an overridden method, but 
    exception thrown must not be new
 -> Unchecked Exceptions
    They can appear anywhere in the program.

*/

class ExceptionClassThrows{
  static void checkFile(String name) throws Exception{
	throw new Exception(); 
/*catch (Exception e){
System.out.println("in checkfile");
e.printStackTrace();
}*/
}


//no catch block or propagation arrangement made 
public static void main(String ...args)throws Exception{
try{
checkFile("Hello.txt");
}
catch (Exception e){
System.out.println("in main");
e.printStackTrace();
}

}
}