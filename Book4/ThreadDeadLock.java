/*
* This program demonstrates how deadlock occurs and how to avoid deadlocks
* 
* Concept--
* DeadLock occurs when there is sharing of resources between two threads
* synchronized block is used to lock the resources
* 
* 
* Synchronized block can be 
* 1)Static/Non-static method can be Synchronized
* 2)Static/ Non-static blocks can be Synchronized
* Synchronized block cannot be
* 1) Classes
* 2) Declaration 
* 
* How to Avoid DeadLocks--
* 1) Mutual Exclusion
* 2) Hold and Wait
* 3) No preemption
* 4) Circular Wait
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/


class DeadLockMain {
boolean lock = true;

void printInfo(){
synchronized(this)
{
 try{

 System.out.println(Thread.currentThread()); 
Thread.sleep(1000);
}
catch(Exception e){
} 
}
}
}


class DeadLock1 implements Runnable{
DeadLockMain d1;

DeadLock1(DeadLockMain d1){
this.d1 = d1;
Thread t1 = new Thread(this,"Thread1");
t1.start();

}

public void run(){
d1.printInfo();

}

}

class DeadLock2  implements Runnable{
DeadLockMain d1;

DeadLock2(DeadLockMain d1){
this.d1 = d1;
Thread t2 = new Thread(this,"Thread2");
t2.start();
}

public void run(){
d1.printInfo();

}

}





class ThreadDeadLock{
public static void main(String args[]){
DeadLockMain d = new DeadLockMain();
DeadLock1 t1 = new DeadLock1(d);
DeadLock2 t2 = new DeadLock2(d);
//Thread t2 = new Thread(d,"Thread2");

}

}
