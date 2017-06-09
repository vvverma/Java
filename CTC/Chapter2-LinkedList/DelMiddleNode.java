/*
In this program we are going to delete the given middle node of the link
list without any head pointer.
CTC CHAPTER2 2.3
Note--
Any node except first and the last node

Related Files--
LinkedList.java 

*/


class DelMiddleNode{

static void delMiddle(Node del){
Node temp = del;
while(del.getNext() != null){
del.setData(del.getNext().getData());
del = del.getNext();
}
while(temp.getNext().getNext() != null)
temp = temp.getNext();
temp.setNext(null);
}

public static void main(String args[]){
//create link list 
LinkList l6 = new LinkList();

for(int i = 1; i<7 ; i++){
l6.appendAtTail(i);
}
l6.printList();
delMiddle(l6.findNode(5));
l6.printList();
}
}