/*
This program is a solution to Chapter 2 problem number 2.1

Comment--
There are two possible solutions to this problem.
1) with temporary buffer which gives O(n)- space and O(n)- time complexity
2) Without temporary buffer which gives O(1)- space and O(n2)- time complexity

Files Related--
LinkedList.java - this file contains node data type as int;
RemoveDuplicateA - without temporary buffer
RemoveDuplicate(this file) - with temporary buffer
*/
import java.util.*;


class RemoveDuplicateA{
static void removeDuplicate(LinkList l1){
Node head = l1.getHead();
Node runner = head;
while(head != null){
while(runner.getNext() != null){
if(runner.getNext().getData() == head.getData()){
runner.setNext(runner.getNext().getNext());
}
runner = runner.getNext();

}
head = head.getNext();
runner = head;
}

l1.printList();
}


public static void main(String args[]){
LinkList l1 = new LinkList();

char[] charac = args[0].toCharArray();
for(char a : charac){
l1.appendAtTail(a);
}
l1.printList();
removeDuplicate(l1);

}



}

