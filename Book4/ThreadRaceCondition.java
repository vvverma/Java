/*
* This program demonstrates thread lock, thread Synchronization and how
* race condition occurs in threads
* 
* Concept--
* Problem in multithreading-
* When two threads need access to the same resources(variable or object), care
* must be taken so that they do not try to use the same resource at the same
* time 
* synchronized keyword is used to get rid of race condition
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/

class TicketReservation implements Runnable{
int ticketAvail = 1;
int ticketNeed;

TicketReservation(int num){
ticketNeed = num;
}

synchronized public void run(){
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

class ThreadRaceCondition{
public static void main(String args[])throws Exception{
TicketReservation t = new TicketReservation(1);
//TicketReservation t1 = new TicketReservation(1);
Thread th1 = new Thread(t,"Vishal Verma");
Thread th2 = new Thread(t,"Neha Verma");
th1.start();
th2.start();
}

}
