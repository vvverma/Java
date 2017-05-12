/*
This program demonstrates about the concept of nested classes

Concept-
There are fours types of nested classes
1) Member Inner Class 	2) Static Inner Class
3) Local Member Class   4) Anonymous Class

There different ways of calling the nested classes
The following table below demonstrates nested classes
		
			MemberInner  Static  LocalInner  Anonymous
  		           Class     Class    Class        Class
----------------------------------------------------------------------------
Access Specifier            Yes	      Yes      Yes          Yes
----------------------------------------------------------------------------
Extends & Implements        Both      Both     Both        Either
----------------------------------------------------------------------------
Static Fields & Methods     No        Yes      No            No
----------------------------------------------------------------------------
Accessing the outside       Yes       Yes      Yes          Yes
Class members(even private)
----------------------------------------------------------------------------
Abstract & final            Both      Both     Both         Final
----------------------------------------------------------------------------
local member variable       NA        NA        Final       Final
----------------------------------------------------------------------------


In this program we are going to demonstrate on Nested class of  Anonymous Class
Type
provided inside the method declaration but should have final local member variable
It can either extend or implement a class or interface
*/

interface Anonymous{
void show();
}


abstract class AnonymousClass{
 String location = "Anonymous Class";
 abstract public void show();
}



class NestedClassAnony{


public static void main(String args[]){

AnonymousClass c = new AnonymousClass(){
public void show(){
System.out.println("I am in : "+ location);
}
};

c. show();

Anonymous c1 = new Anonymous(){
String location = "Anonymous Interface";
public void show(){
System.out.println("I am in : "+ location);
}
};
c1.show();
}
}



