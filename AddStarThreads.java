/*
This program adds a comment block or prolog to the java files using 
multhreading concept.

RelatedFiles--
AddStarClass.java

*/
import java.io.*;

class FileReaderClass implements Runnable{
StringBuilder sb;
String fileName;
FileReaderClass(String fileName){
sb = new StringBuilder();
this.fileName = fileName;
}

public void run(){
BufferedReader br;



synchronized(sb){
try{
br = new BufferedReader(new FileReader(fileName));
System.out.println("File reading: "+Thread.currentThread());
br = new BufferedReader(new FileReader(fileName));
String line;
while((line = br.readLine()) != null){
sb.append(line);
sb.append("\n"); 
}
br.close(); 
}
catch(Exception e){
System.out.println(e);
}
sb.notify();
System.out.println("File reading done: "+Thread.currentThread());
}
}
}




class FileWriterClass implements Runnable{
String fileName;
FileReaderClass fr;
String[] processString;

FileWriterClass(FileReaderClass fr,String fileName){
this.fr = fr;

this.fileName = fileName;
}

public void run(){
BufferedWriter bw;
synchronized(fr.sb){
System.out.println("File Writing: "+Thread.currentThread());

try{
fr.sb.wait();
System.out.println("File Writing Wait Over: "+Thread.currentThread());
processString = fr.sb.toString().split("\n");
for(int s = 1 ; s <processString.length ; s++){
 if(processString[s].equals("/*"))
  continue;
 else if(processString[s].equals("*/"))
 break;
 else
 processString[s] = "*" + processString[s];  
}
bw = new BufferedWriter(new FileWriter(fileName,false));
for(String s : processString){
bw.write(s);
bw.newLine();
}
bw.close();
}
catch(Exception e){
System.out.println(e);
}

finally{
System.out.println("Processing over");
}
}
}
}



class AddStarThreads{
public static void main(String args[]){
FileReaderClass fr = new FileReaderClass(args[0]);
FileWriterClass fw = new FileWriterClass(fr,args[0]);;
Thread read = new Thread(fr, "FileReaderThread");
Thread write = new Thread(fw, "FileWriterThread");

write.start();
read.start();

}


}