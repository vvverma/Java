/*
* This program demonstrates and exmaple how deadlock occurs and how to avoid deadlocks
* 
* Concept--
* DeadLock occurs when there is sharing of resources between two threads
* synchronized block is used to lock the resources
* 
* Synchronized block can be 
* 1)Static/Non-static method can be Synchronized
* 2)Static/ Non-static blocks can be Synchronized
* Synchronized block cannot be
* 1) Classes
* 2) Declaration 
* 
* 
* How to Avoid DeadLocks--
* 1) Mutual Exclusion
* 2) Hold and Wait
* 3) No preemption
* 4) Circular Wait
* 
* Explanation--
* This program below create two thread -- Thread1 and Thread2
* Thread1 gets access to train object and is locked while Thread2
* also gets access to compartment object later both the Threads wait for 
* train and compartment to be released. Due this reason we get errenuos 
* output.
* 
* RelatedFiles--
* ThreadDeadLock.java
* ThreadDeadLockA.java(Problem)
* ThreadDeadLockB.java(DeadLock Solved)
* 
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/



class BookTicket implements Runnable{
Object train,comp;

BookTicket(Object t, Object c){
train = t;
comp = c;
}

public void run(){

synchronized(train){
System.out.println("Book Ticket locked on train by "+Thread.currentThread());
try{
Thread.sleep(150);
}
catch(Exception e){
}
System.out.println("Book Ticket waiting to lock on comp by "+Thread.currentThread());
}


synchronized(comp){

System.out.println("Book Ticket locked on comp by "+Thread.currentThread());
}
}
}

class CancelTicket  implements Runnable{
Object train,comp;

CancelTicket(Object t, Object c){
train = t;
comp = c;
}

public void run(){

synchronized(comp){
System.out.println("Cancel Ticket locked on comp by "+Thread.currentThread());
try{
Thread.sleep(150);
}
catch(Exception e){
}
System.out.println("Cancel Ticket waiting to lock on train by "+Thread.currentThread());
}


synchronized(train){

System.out.println("Cancel Ticket locked on train by "+Thread.currentThread());
}
}
}





class ThreadDeadLockA{
public static void main(String args[]){
Object train = new Object();
Object comp = new Object();
BookTicket bt = new BookTicket(train,comp);
CancelTicket ct = new CancelTicket(train,comp);
Thread t1 = new Thread(bt,"Thread1");
Thread t2 = new Thread(ct,"Thread2");
t1.start();
t2.start();
}

}
