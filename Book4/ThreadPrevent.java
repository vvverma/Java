/*
* This program demonstrates two different ways preventing Threads execution
* 
* 
* Concept--
* Methods used to prevent thread execution
* 1) sleep()
* 2) yield()
* 3) join()
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

import java.util.*;


class ThreadTest1 implements Runnable {
Thread t;
ThreadTest1(String threadName){
t = new Thread(this,threadName);
t.start();
try{
//t.join(); // waits for one thread to completely get over
}
catch(Exception e){
System.out.println(e);
}
}

public void run(){
System.out.println("Entering in thread : " + Thread.currentThread());
for(int i =0; i< 6 ; i++) {
System.out.println("hello in thread"+Thread.currentThread()+ i);
try{
Thread.sleep(1000);
Thread.yield(); //puts the thread to halt
}
catch(Exception e){
System.out.println(e);
}
}

System.out.println("Exiting in thread "  + Thread.currentThread());
}
}




class ThreadPrevent{
public static void main(String args[]) throws Exception{
int numThreads = Integer.parseInt(args[0]);
for(int i = 1 ; i<=numThreads; i++)
new ThreadTest1("Thread"+ i);
}
}
