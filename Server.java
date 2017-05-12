/*


*/

package ser.com;
import java.net.*;
import java.io.*;

public class Server{

public static void main(String args[]){

 int portNumber = 6066;

try{
ServerSocket  server= new ServerSocket(portNumber);


  System.out.println("Waiting for client on port " + 
               server.getLocalPort() + "...");
            Socket server1 = server.accept();
            
            System.out.println("Just connected to " + server1.getRemoteSocketAddress());
	
ObjectOutputStream os = new ObjectOutputStream(server1.getOutputStream());
ObjectInputStream is = new ObjectInputStream(server1.getInputStream());
ReadFile obj = null;
obj = (ReadFile) is.readObject();
is.close();
os.close();
String line =  obj.getContent();
System.out.println(line);
System.out.println("ReadFile deserilzation is complete"); 
   
server1.close();
}
catch(Exception e){
e.printStackTrace();
}


}


}
