/*
* * 
* * This program demonstrates the basic thread implementation
* * 
* * Uses--
* * Multi-Tasking
* * There are two types of MultiTaskng
* * 1) Process based multitasking
* *    several programs are executedat a time.  
* * 2) Thread based multitasking
* *    several parts of the same program are getting executed at a time
* * 
* * Concept--
* * Thread represents a seperate path of execution of group of statements
* * 
* * Threads are in one of the five states
* * 1) New State 
* * 2) Runnable State
* * 3) Running State
* * 4) Blocked State(Waiting/Sleeping) 
* * 5) Terminated/Dead State
* * 
* *  @author  Vishal Verma
* *  @version 1.0
* *  @since   JDK 1.8.0
* * 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/
class ThreadBasicInfo{
public static void main(String[] args){

System.out.println("Information on current thread");
Thread t = Thread.currentThread(); //returns a reference to the currently executing thread

System.out.println("Current Thread: "+ t);
System.out.println("Thread ID:" + t.getId());
System.out.println("Thread NAME:"+ t.getName());
System.out.println("Thread PROIRITY:" + t.getPriority());
System.out.println("Thread STATE:" + t.getState());
System.out.println("Thread ALIVE:" + t.isAlive());

}

}
