/*
* This program demonstrates thread lock, thread Synchronization and how
* race condition occurs in threads
* 
* Concept--
* Problem in multithreading-
* When two threads need access to the same resources(variable or object), care
* must be taken so that they do not try to use the same resource at the same
* time 
* 
* synchronized keyword is used to get rid of race condition
* 
* The virus class thread overrides the availble ticket number and hence everyone
* gets the ticket despite of availability
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class TicketReservation1 implements Runnable{
static int ticketAvail = 1;
static int ticketNeed;

TicketReservation1(){}
TicketReservation1(int num){
ticketNeed = num;
}

public void run(){
System.out.println(ticketAvail);
if(ticketAvail>= ticketNeed){
System.out.println("Ticket Confirmed for :"+ Thread.currentThread().getName());
try{
Thread.sleep(1000);
ticketAvail -= ticketNeed;

}
catch(Exception e){
System.out.println(e);
}


}
else{
System.out.println("Ticket not available for: "+ Thread.currentThread().getName());
}
}
}


class Virus  extends TicketReservation1 implements Runnable{
int error;
Virus(int i){
 error = i;
}
public void run(){
System.out.println("Actaul Value of Avalaible ticket "+ ticketAvail);
ticketAvail = error;
System.out.println("Virus :"+ Thread.currentThread().getName());
}

}

class ThreadRaceCondition1{
public static void main(String args[])throws Exception{
TicketReservation1 t = new TicketReservation1(1);
Virus v = new Virus(100);// this will introduce virus
Thread th2 = new Thread(v,"VIRUS");
Thread th1 = new Thread(t,"Vishal Verma");
Thread th3 = new Thread(t,"Neha Verma");
th1.start();
try{
th1.join();

th2.start();

th2.join();
}
catch(Exception e){}

th3.start();

}

}
