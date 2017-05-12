/*
Testing the package com using this test file.
The test file will be created with importing the 
com.static package.
One way of accessing package

Related files--
PackageClassStactic
*/

import com.staticcom.*;

class PackageStaticTest1{

public static void main(String args[]){
System.out.println(PackageClassStatic.number);
//System.out.println(PackageClassStatic.nonstatic); // will give error
PackageClassStatic.printStatic();
//PackageClassStatic.printNonStatic(); // will give error
}
}