package ser.com;
import java.io.*;
public class SerializationClass{
public static void main(String args[]){
ReadFile rf = new ReadFile(args[0]);
try{

FileOutputStream fs = new FileOutputStream("ReadFile.ser");
ObjectOutputStream os = new ObjectOutputStream(fs);
os.writeObject(rf);
os.close();
fs.close();
System.out.println("ReadFile serilzation is complete"); 
}
catch(Exception e){
System.out.println(e);
}



}
}