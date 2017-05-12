/*


*/

package ser.com;
import java.net.*;
import java.io.*;

public class Client{

public static void main(String args[]){
 String serverName = "localhost";
int portNumber=6066;

try{
Socket client = new Socket(serverName, portNumber);

         System.out.println("Just connected to " + client.getRemoteSocketAddress());

			
			ReadFile rf = new ReadFile(args[0]);

ObjectOutputStream os = new ObjectOutputStream(client.getOutputStream());
ObjectInputStream is = new ObjectInputStream(client.getInputStream());
os.writeObject(rf);
os.close();
is.close();
System.out.println("ReadFile serilzation is complete"); 
		 
		 
client.close();
}
catch(IOException e){
e.printStackTrace();
}


}


}
