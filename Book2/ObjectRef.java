/*
* This program is to demonstrate the concept of object relation in class
* hierarchy
* 
* Concept--
* Every object of the Sub-Class is also an object of super class but not
* viceversa
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/


interface Fish{}

class Perch implements Fish{}

class Walleye extends Perch{}

class Bluegill{}

class Fishermen{
public static void main(String args[]){
Fish f = new Walleye();
Bluegill b = new Bluegill();
Walleye w = new Walleye();
if(f instanceof Perch)
System.out.println("f is instance of perch class");

if(w instanceof Fish)
System.out.println("w is instance of Fish class");

if(b instanceof Fish)
System.out.println("b is instance of Fish class");

} 

}
