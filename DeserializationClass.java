/*
This program demonstrates the concept of Serialization and Deserialization

Use--
Serialization is the process of translating data (example, employee class)
into a format (sequence of bytes) that can later be reconstructed or 
extracted.
Helps us to send multiple data at once



*/
package ser.com;
import java.io.*;
public class DeserializationClass {
public static void main(String args[]){
try{
FileInputStream fs = new FileInputStream("ReadFile.ser");
ObjectInputStream is = new ObjectInputStream(fs);
ReadFile obj = null;
obj = (ReadFile) is.readObject();
is.close();
fs.close();
String line =  obj.getContent();
System.out.println(line);
System.out.println("ReadFile deserilzation is complete"); 
}
catch(Exception e){
System.out.println(e);
}

}
}
