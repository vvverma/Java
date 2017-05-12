/*
This program demonstrates comment finder and adding * in the prologue 
of the java file 

*/
import java.io.*;

public class AddStarClass{

public static void main (String args[]){

try {
FileReader fr = new FileReader(args[0]);
BufferedReader in = new BufferedReader(fr);
String readLine;
final String prologue =  "\n @author  Vishal Verma\n @version 1.0\n @since   JDK 1.8.0\n"; 
boolean comment = false;
boolean staradded = false;
StringBuilder fileContent = new StringBuilder();
while((readLine = in.readLine()) != null){ 
	if(readLine.equals("/*"))
		comment = true;
	if (readLine.equals("*\n"))
     	staradded = true;

	if(readLine.equals("*/")){
	fileContent.append(prologue);
	fileContent.append("\n");
}
	fileContent.append(readLine);
	fileContent.append("\n");
}
if(!comment){

	fileContent.insert(0," /* \n\n\n\n\n\n\n\n\n\n\n\n\n"+ prologue+"\n" +"\n*/\n");
}

in.close();



String[] editContent = fileContent.toString().split("\n");

for(int i=1;i<editContent.length;i++){
	if(editContent[i].equals("/*"))  
        continue;	
	else if(editContent[i].equals("*/"))                            
	break;	 
 	else 
	editContent[i] ="* " + editContent[i]; 	
}





//open the file 
if (!staradded)
{	
FileWriter fw= new FileWriter(args[0], false); //true tells to append data.
BufferedWriter out = new BufferedWriter(fw);


for(String line2 : editContent)
{
out.write(line2);
out.newLine(); 
}
out.close();

}
else
	System.out.println("Stars already added");

}
catch(IOException e) {
System.out.println("This file does not exist in the given directory");

}
catch(ArrayIndexOutOfBoundsException e) {
System.out.println("Please Enter a filename along with the command");
}

}
}