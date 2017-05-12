/**
* This program is to demonstrate book3 program from chapter12 
* @author  Vishal Verma
* @version 1.0
* @since   JDK 1.8.0  
*
*/

public class Chapter12Navel{
private int size = 7;
private static int length = 3 ; 
public static void main(String args[]){
new Chapter12Navel().go();
}

void go(){
int size = 5;
System.out.println(new Gazer().adder());
}

class Gazer{
int adder(){
return size*length;
}
}
}
