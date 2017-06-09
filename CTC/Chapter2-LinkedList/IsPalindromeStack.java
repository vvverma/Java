/*
This program demonstrates palindrome check using stack method in LinkList

CTC Chapter2 - 2.6

Related Files--
LinkedList.java 
*/
import java.util.*;
class IsPalindromeStack{

boolean isPalindrome(Node head){
Node temp = head;
Node slow = head, fast =head; 
Stack<Integer> s = new Stack<Integer>();
while((fast !=null)&&(fast.getNext() != null)){
s.push(slow.getData());
slow = slow.getNext();
fast = fast.getNext().getNext();
}

if(fast != null)
slow = slow.getNext();

while(slow!=null){
if(s.pop() != slow.getData())
return false;
slow = slow.getNext();
}
return true;
}





public static void main(String args[]){
LinkList l1 = new LinkList();

for(int i = 1 ; i<=2; i++)
l1.appendAtTail(i);

for(int i =2 ; i>0; i--)
l1.appendAtTail(i);
l1.printList();
System.out.println( new  IsPalindromeStack().isPalindrome(l1.getHead()));
}
}
