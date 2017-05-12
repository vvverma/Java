/*
* This program demonstrates about the concepts and rules of Abstract Class
* and abstract method
* 
* Use-- 
* Abstract Classes are implemented to declare the characteristics of the 
* SubClasses. They are used to provide a template or design for concrete 
* SubClasses down the inheritence line
* 
* Rules--
* 1) A class declared abstract may or may not have abstract methods
* 2) An Abstract class abstract methods must be declared by its subclass
*    which is non abstract itself 
* 3) Abstract class cannot be instantiated.
* 4) An Abstract Class can be a superclass to another abstract subclass
*   in such a case there is no need to implement the abstract superclass
*   methods
* 5) Abstract class methods cannot be both final and abstract or private 
*    abstract 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

abstract class MumbaiUniversity {
MumbaiUniversity(){
System.out.println("MU Contructor fired !");
}
/*concrete method*/
void semOne(){
System.out.println("mu will take");
}
/*abstract method*/
abstract void semTwo();
abstract void semThree();
/*concrete method*/
void semFour(){
System.out.println("mu will take");
}
}

class CollegeA extends MumbaiUniversity{
CollegeA(){
System.out.println("CollegeA Contructor fired !");
}
 void semTwo(){
System.out.println("Sem2 collegeA");
}
 void semThree(){
System.out.println("Sem3 collegeA");
}
} 

class CollegeB extends MumbaiUniversity{
CollegeB(){
System.out.println("CollegeB Contructor fired !");
}

void semTwo(){
System.out.println("Sem2 collegeB");
}
void semThree(){
System.out.println("Sem3 collegeB");
}
}

class AbstractClass{
public static void main(String args[]){
CollegeA colA = new CollegeA();
CollegeB colB = new CollegeB();
MumbaiUniversity colMu = new CollegeA();//polymorphic reference
//MumbaiUniversity Mu = new MumbaiUniversity(); // cannot instantiate abst class
System.out.println("College A");
colA.semOne();
colA.semTwo();
colA.semThree();
colA.semFour(); 
System.out.println("College B");
colB.semOne();
colB.semTwo();
colB.semThree();
colB.semFour();
//the below code will not work -CF
/*mU.semOne();
mU.semTwo();
mU.semThree();
mU.semFour(); 

 @author  Vishal Verma
 @version 1.0
 @since   JDK 1.8.0

*/
System.out.println("Polymorphic reference"); 
colMu.semOne();
colMu.semTwo();
colMu.semThree();
colMu.semFour();

}
}
