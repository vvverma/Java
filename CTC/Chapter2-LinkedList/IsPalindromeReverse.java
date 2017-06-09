/*
This program demonstrates palindrome check using reverse method in LinkList

CTC Chapter2 - 2.6

Related Files--
LinkedList.java 
*/
class IsPalindromeReverse{

boolean isPalindrome(Node head){
Node reverse = reverseList(head);
return isEqual(head,reverse);
}

Node reverseList(Node head){
Node curr = head;	
Node prv = null, next = null;
while(curr != null){
	Node n  = new Node();
	n.setData(curr.getData());
	n.setNext(prv);
	prv = n;
    curr = curr.getNext();		
}	
return prv;
}

boolean isEqual(Node head, Node reverse){


while((head!=null)&&(reverse != null)){
System.out.println(head.getData()+ " "+ reverse.getData() )	;
if(head.getData() != reverse.getData()){
return false;
}
head = head.getNext();
reverse = reverse.getNext();
}

return true;
}


public static void main(String args[]){
LinkList l1 = new LinkList();

for(int i = 1 ; i<=4; i++)
l1.appendAtTail(i);

for(int i =2 ; i>0; i--)
l1.appendAtTail(i);
l1.printList();
System.out.println( new  IsPalindromeReverse().isPalindrome(l1.getHead()));
}
}
