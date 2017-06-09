/*
This program shows how to implement ArrayList which implements List interface

Concept--
O - ORDERED
XO - NOT ORDERED
S - SORTED
XS - NOT SORTED
Collections framework class consists of
A) Collection interface which consist of following interfaces given below

I) List Interface consist of following classes

1) ArrayList        O - BY INDEX , XS 
2) LinkedList       O - BY INDEX, XS
3) Vector           O - BY INDEX, XS

II) Set interface consist of following classes
A set cares bout uniqueness - it does not allow duplicates. The equals() method
determines whether two objects are identical. 

1) HashSet      XO, XS 
2) LinkedHashSet O, XS
3) TreeSet      S

III) Queue interfaces consist of following classes

1) Priority Queue O- BY INDEX, XS
2) LinkedList    O-BY INDEX,XS

Methods in common--
add();
remove();
contains();
size();
iterator();


B) Map interface consist collection framework 
A Map cares about unique identifiers. Map relies on the equals() method to
determine whether two keys are same or different. The can take same values 
but not same keys
1) HashMap   XO,XS   
2) LinkedHashMap O-BY INDEX,XS
3) TreeMap  O AND S
4) HashTable XO,XS

Methods in common--
put(key,value);
containsKey();
containsValue();
isEmpty();
size();


Related Files--
ArrayListCol.java
LinkedListCol.java
HashSetCol.java
TreeSetCol.java
LinkedHashSetCol.java
HashMapCol.java
TreeMapCol.java
LinkedHashMapCol.java

*/

import java.util.*;


class ArrayListCol{
public static void main(String args[]){

ArrayList<String> al = new ArrayList<String>(); 
al.add("Hello");
al.add("I");
al.add("am");
al.add("JAVA");
al.add("-OOD");

System.out.println("The ArrayList Contents:"+ al);
System.out.println("The ArrayList Contains JAVA:"+ al.contains("JAVA"));
System.out.println("The ArrayList Size:"+ al.size());
System.out.println("The ArrayList Remove:"+ al.remove("-OOD"));
System.out.println("The ArrayList Size:"+ al.size());
System.out.println("The ArrayList Contents:"+ al);
}
}

