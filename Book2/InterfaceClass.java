/*
* This program demonstrates about the concepts and rules of Interface Class
* 
* Use-- 
* Interfaces are more flexible than base classes because you can define a 
* single implementation that can implement multiple interfaces. Interfaces
* are better in situations in which you do not have to inherit implementation
* from a base class. Interfaces are useful when you cannot use class 
* inheritance.
* 
* Rules--
* 1) An Interface class contains all abstract methods
* 2) An Interface class abstract methods must be declared by its subclass
*    which is non abstract itself with public access modifier 
* 3) Interface methods must not be static or final
* 4) An Interface Class declares only constant and not instance variables
* 5) Interface class methods cannot private or protected methods 
* 6) Interfaces do not have constructors
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/


interface University{
int numExam = 4;// the variable must be intialized or must be static
//public and final
void printExam();
}
interface MumbaiUniversity extends University {
/*all are abstract method*/
void semOne();
void semTwo();
void semThree();
void semFour();
}

class CollegeA implements MumbaiUniversity{
public void printExam(){
System.out.println("Number of semester"+ numExam);
}
public void semOne(){
System.out.println("mu will take");
}
public void semTwo(){
System.out.println("Sem2 collegeA");
}
public void semThree(){

System.out.println("Sem3 collegeA");
}
public void semFour(){
System.out.println("mu will take");
}

} 

class CollegeB implements MumbaiUniversity{
public void printExam(){
System.out.println("Number of semester"+ numExam);
}
public void semOne(){
System.out.println("mu will take");
}

public void semTwo(){
System.out.println("Sem2 collegeB");
}
public void semThree(){
System.out.println("Sem3 collegeB");
}
public void semFour(){
System.out.println("mu will take");
}

}

class InterfaceClass{
public static void main(String args[]){
CollegeA colA = new CollegeA();
CollegeB colB = new CollegeB();
MumbaiUniversity colMu = new CollegeA();//polymorphic reference
//MumbaiUniversity Mu = new University(); CF abstract class
System.out.println("College A");
colA.printExam();
colA.semOne();
colA.semTwo();
colA.semThree();
colA.semFour(); 
System.out.println("College B");
colB.printExam();
colB.semOne();
colB.semTwo();
colB.semThree();
colB.semFour();

System.out.println("Polymorphic reference"); 
colMu.semOne();
colMu.semTwo();
colMu.semThree();
colMu.semFour();

}
}
