/*
Testing the package com using this test file.
The test file will be created with importing the 
com.static package.
Second way of accessing package

Related files--
PackageClassStactic
*/

import static com.staticcom.PackageClassStatic.*;

class PackageStaticTest2{

public static void main(String args[]){
System.out.println(number);
//System.out.println(nonstatic); // will give error
 printStatic();
//printNonStatic(); // will give error
}
}