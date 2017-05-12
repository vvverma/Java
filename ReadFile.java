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

public class ReadFile implements Serializable{
private String line;
private StringBuilder str = null ;
transient FileReader fr = null;
transient BufferedReader br = null;

public String getContent(){
return str.toString();
}
ReadFile(String filename){
init(filename);
}
void init(String filename){
try{
fr = new FileReader(filename);
 br = new BufferedReader(fr);
str = new StringBuilder();
while((line = br.readLine()) != null){
	str.append(line);
}
fr.close();
br.close();
 
}
catch(IOException e){
System.out.println("File Not Found");
}
catch(Exception e){
System.out.println(e);
}
}
}


