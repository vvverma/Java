/*
This program demonstartes about the programs written in 
book number 2 of ocpjp chapter9

Topic--
Access modifier - public, private,protected and default
 
*/

package com.wickedlysmart;
import com.wickedlysmart2.*;

public class Launcher{
public static void main(String args[]){
Utils u = new Utils(); // error in this line as the class is default in other package.
u.do1();
u.do2();
u.do3();
}
}
