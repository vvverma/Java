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
}
}
}



class FileProcessingClass implements Runnable{
FileReaderClass fr;
String[] processString;
StringBuilder sb;

FileProcessingClass(FileReaderClass fr){
this.fr = fr;

}

public void run(){
BufferedWriter bw;
synchronized(fr.sb){
synchronized(sb){
System.out.println("File Processing: "+Thread.currentThread());
try{
fr.sb.wait();
processString = fr.sb.toString().split("\n");
for(int s = 1 ; s <processString.length ; s++){
 if(processString[s].equals("/*"))
  continue;
 else if(processString[s].equals("*/"))
 break;
 else
 processString[s] = "*" + processString[s];  
}

}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("Processing over");
}

sb = new StringBuilder();
for(String s : processString)
sb.append(s);
sb.notify();
}
}
}
}







class FileWriterClass implements Runnable{
String fileName;
FileProcessingClass fp;
FileReaderClass fr;
//String[] processString;

FileWriterClass(FileProcessingClass fp,String fileName,FileReaderClass fr){
this.fp = fp;
this.fr = fr;

this.fileName = fileName;
}

public void run(){
BufferedWriter bw;
synchronized(fr.sb){
synchronized(fp.sb){
System.out.println("File Writing: "+Thread.currentThread());
try{
fp.sb.wait();

bw = new BufferedWriter(new FileWriter(fileName,false));
for(String s : fp.processString){
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
}



class AddStarThreadsFaulty{
public static void main(String args[]){
FileReaderClass fr = new FileReaderClass(args[0]);
FileProcessingClass fp = new FileProcessingClass(fr);
FileWriterClass fw = new FileWriterClass(fp,args[0],fr);
Thread process = new Thread(fp, "FileProcessThread");
Thread read = new Thread(fr, "FileReaderThread");
Thread write = new Thread(fw, "FileWriterThread");

write.start();
process.start();
read.start();

}


}