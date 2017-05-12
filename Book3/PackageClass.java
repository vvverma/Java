/*
This program will demonstrate how create package and different rules
of creating it.

Use --
1) Packages are used to avoid source code conflicts i.e. When two java
   programmers write a source code with same name but performing different
   task.
2) Package is a Java encapsulation mechanism that can be used to group
   group related classes,interfaces,enums and sub-packages

Rules --
1) Package must contain only one public class. Moreover, the file name for 
   the source code java file must be same as public class name.
2) While creating a package, the package name statement should be the first
   statement before the import statement.
3) Naming convention of the package file is related to company domain name
   for e.g. com.mypackage.myproject

Commands --
1) Compiling the package file   javac -d . <classname.java> 

2) The above command will create a package named folder and a class file.
   Move that class file in this directory

*/

package com;

public class PackageClass{

private int numOfTopics = 15;


public void printTopics(){
System.out.println("Number of topics to learn in Index " +numOfTopics);
}
}