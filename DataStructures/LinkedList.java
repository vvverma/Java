/*
This program is relted to implementation of Linked List Data Structures.


*/
import java.util.*;


class Node{
 Node next;
 int data;

Node(){
next = null;
}

 void setData(int d){
data = d;
}

 int getData(){
return data;
}

 Node getNext(){
return next;

}

 void setNext(Node nxt){
next = nxt;
}

}


class LinkList {
Node head;
Node middle;

LinkList(){
head = null;
}

Node getHead(){
return head;
}

void setHead(Node h){
head = h;
}

void appendAtTail(int data){
Node newNode = new Node();
newNode.setData(data);
Node temp;
if(head == null){
head = newNode;
}
else{
temp = head;
while(temp.getNext() != null){
temp = temp.getNext();	
}
temp.setNext(newNode);
}
}


void appendAtHead(int data){
Node newNode = new Node();
Node temp;
newNode.setData(data);
if(head == null){
   head = newNode;
}
  else{
temp = head;
newNode.setNext(temp);
head = newNode;
}
}

void printList(){
Node temp;
temp = head;
while(temp != null){
System.out.print("-->"+ temp.getData());
temp = temp.getNext();
}
System.out.println();
}


void reverseList(){
Node curr = head;
Node prv = null,next = null;

while(curr !=null){
next = curr.getNext();
curr.setNext(prv);
prv = curr;
curr = next;
}

head = prv; 
}

void deleteNodeAtTail(){
Node temp = head;
while(temp.getNext().getNext() != null)
temp = temp.getNext();

temp.setNext(null);
}

void deleteNodeAtFront(){
Node temphead = head;
head = temphead.getNext();
}

void deleteNode(int d){
Node temp = head;
Node prv = null, next = null;
while(temp != null){
   next = temp.getNext();
   if(temp.getData() == d)
   break;
   prv = temp;
   temp = next;
}

if(temp == head.getNext())
head = temp;
if(temp != null) 
prv.setNext(next);
else
System.out.println("Number Not found");
}



void tortoiseHare(){
Node slow = head;
Node fast = slow.getNext();

while(fast != null && fast.getNext()!= null){
System.out.println("Slow "+ slow.getData()+"       "+"Fast "+ fast.getData());
slow = slow.getNext();
fast = fast.getNext().getNext();
}

middle = slow.getNext();
}


Map<String,Node> splitLinkList(){
Node head1 = head;
Node head2 = middle;
while(head1.getNext() != middle)
head1 = head1.getNext();
middle = null;
head1.setNext(null);

Map<String,Node> map = new HashMap<String,Node>();
map.put("head1", head);
map.put("head2", head2);
return map;
}

void rearrangeList(LinkList l2, LinkList l3){
Node head1 = l2.getHead();
Node head2 = l3.getHead();


Node temp = new Node();
Node curr = temp;
while(head2 != null && head1 !=null){

  if(head1 != null){
  curr.setNext(head1);
  curr = curr.getNext();
  head1 = head1.getNext();   
}
  if(head2 !=null){
  curr.setNext(head2);
  curr = curr.getNext();
  head2 = head2.getNext();
}

}
head = temp.getNext();
}
}



class LinkedList{
public static void main(String args[]){
LinkList l1 = new LinkList();

for(int i = 0; i< 10 ; i++){
l1.appendAtTail(i);
}

l1.printList();

for(int i = 10; i<20 ; i++){
l1.appendAtHead(i);
}

l1.printList();


/*l1.reverseList();
l1.printList();

l1.deleteNodeAtTail();
l1.printList();

l1.deleteNodeAtFront();
l1.printList();


l1.deleteNode(10);
l1.printList();


l1.deleteNode(100);
l1.printList();
*/
l1.tortoiseHare();

Map<String,Node> map = new HashMap<String,Node>();
map = l1.splitLinkList();

LinkList l2 = new LinkList();
LinkList l3 = new LinkList();
LinkList l4 = new LinkList();
l2.setHead(map.get("head1"));
l3.setHead(map.get("head2"));
l2.printList();
l3.printList();
l3.reverseList();
l3.printList();
l4.rearrangeList(l2,l3);
l4.printList();
}
}