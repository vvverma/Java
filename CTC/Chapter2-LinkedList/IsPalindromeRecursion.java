/*
This program demonstrates palindrome check using recursive method in LinkList

CTC Chapter2 - 2.6

Related Files--
LinkedList.java 
*/
class Result{
public  Node node;
public  boolean result; 
public Result(Node node, boolean result){
this.node = node;
this.result = result;
}
}

class IsPalindromeRecursion{

boolean isPalindrome(Node head){
int length = getLength(head);
Result p = isPalindromeRecurse(head, length);
return p.result;
}

int getLength(Node head){
Node temp = head;
int size=0;
while(temp != null){
size++;
temp = temp.getNext();
}

return size;
}

Result isPalindromeRecurse(Node head, int length){
if(head == null || length<=0){
return new Result(head,true);
}
else if (length == 0){
return new Result(head.getNext(),true);
}
System.out.println(head.getData());
System.out.println(length);
Result res = isPalindromeRecurse(head.getNext(), length-2);

if(!(res.result) || res.node == null){
return res;
}

res.result = (head.getData() == res.node.getData());
//System.out.println(head.getData());
//System.out.println(res.node.getData());
res.node = res.node.getNext();
//System.out.println(res.node.getData());
return res;
}



public static void main(String args[]){
LinkList l1 = new LinkList();

for(int i = 1 ; i<5; i++)
l1.appendAtTail(i);

for(int i = 3 ; i>0; i--)
l1.appendAtTail(i);
l1.printList();
System.out.println( new  IsPalindromeRecursion().isPalindrome(l1.getHead()));
}
}
