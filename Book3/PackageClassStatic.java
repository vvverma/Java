/*
This program is to demonstrate how to create a package with static fields 
and static methods.
We also study about what is a static import statements

Use--
1) Static fields and methods declared in package can be used without instantiation
of class object.
2) Moreover, if static import is used, there will be no need to used any class
   name in front of the static class field and members

*/

package com.staticcom;

public class PackageClassStatic{
static public int number = 13;
 int nonstatic = 14;

public static void printStatic(){
System.out.println(number);
}

public void printNonStatic(){
System.out.println(nonstatic);
} 
}