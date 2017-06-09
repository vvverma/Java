/*
This programm demonstrates the solution of String Rotation from Chapter 1 in
CTC problem number 1.9

Hints--
concat the rotated string and find the if original string is the substring
of new substring

Helper Function--
isSubstring() or contains();
*/
import java.util.*;

class StringRotation{
static boolean isRotation(String original, String rotated){
int len = rotated.length();

if((original.length() == len) && (len >0)){
rotated+=rotated;
//return isSubstring(rotated,original);
return rotated.contains(original);
}
return false;
}

public static void main(String args[]){

boolean flag = isRotation(args[0],args[1]);
System.out.println("The original string is Rotation of new String:" + flag);
}
}

