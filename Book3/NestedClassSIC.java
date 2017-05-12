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


In this program we are going to demonstrate on Nested class of Static Inner Class
Type
It does not need an object instantiation of an outer class

*/


class NestedClassSIC{
static private String location;
NestedClassSIC(){
location = "Outer";
}

static class InnerClass{

// Member Nested Class
InnerClass(){
location = "Inner";
}
void show(){
System.out.println("I am in : "+ location);
}
}

void show(){
System.out.println("I am in : "+ location);
}

public static void main(String args[]){

InnerClass i = new InnerClass();
i.show();

NestedClassSIC.InnerClass c = new NestedClassSIC.InnerClass();
c.show();
}
}



