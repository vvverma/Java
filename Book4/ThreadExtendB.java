/*
* This program demonstrates two different ways of declaring and instantiating
* Threads
* 
* Concept--
* The two ways to implement threads in java is 
* 1) by extending the class with Thread Class
* 2) by implementing Runnable Interface
* 
* Steps--
* 1) declare the class to extend Thread
* 2) override public void run(){} 
* 3) create class object extending thread class or create thread constructor
*    and pass class object
* 4) call start() to get the thread alive
* 
* Related Files--
* ThreadExtendA.java -- without thread constructor
* ThreadExtendB.java -- with thread constructor
* ThreadImplements.java 
* 
* 
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class ThreadTestB extends Thread{

public void run(){
System.out.println("Entering in thread");
for(int i =0; i< 6 ; i++)
System.out.println("hello in thread");

System.out.println("Exiting in thread");
}

}


class ThreadExtendB{
public static void main(String args[]){
ThreadTest t = new ThreadTest();
Thread t1 = new Thread(t);
System.out.println("Entering in Main thread");
t1.start();
System.out.println("Exiting in Mainthread");
}
}
