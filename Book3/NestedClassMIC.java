/*
*This program demonstrates about the concept of nested classes
*
*Concept-
*There are fours types of nested classes
*1) Member Inner Class 	2) Static Inner Class
*2) Local Member Class   4) Anonymous Class
*
*There different ways of calling the nested classes
*The following table below demonstrates nested classes
*		
*			MemberInner  Static  LocalInner  Anonymous
*  		           Class     Class    Class        Class
*----------------------------------------------------------------------------
*Access Specifier            Yes	      Yes      Yes          Yes
*----------------------------------------------------------------------------
*Extends & Implements        Both      Both     Both        Either
*----------------------------------------------------------------------------
*Static Fields & Methods     No        Yes      No            No
*----------------------------------------------------------------------------
*Accessing the outside       Yes       Yes      Yes          Yes
*Class members(even private)
*----------------------------------------------------------------------------
*Abstract & final            Both      Both     Both         Final
*----------------------------------------------------------------------------
*local member variable       NA        NA        Final       Final
*----------------------------------------------------------------------------
*
*
*In this program we are going to demonstrate on Nested class of Member Inner Class
*Type
**/


class NestedClassMIC{
private String location;
NestedClassMIC(){
location = "Outer";
}

class InnerClass{

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
NestedClassMIC n = new NestedClassMIC();
n.show();

NestedClassMIC.InnerClass i = n.new InnerClass();
i.show();

NestedClassMIC.InnerClass c = new NestedClassMIC().new InnerClass();
c.show();
}
}



