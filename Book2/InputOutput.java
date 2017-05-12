/*
* * Write program to implement input/output functionality
* * 
* *  @author  Vishal Verma
* *  @version 1.0
* *  @since   JDK 1.8.0
* * 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/
import java.io.*;

class InputOutput
{
	public static void main(String  ...args) throws IOException
	{
		//Construct the stream
		InputStreamReader isr = new InputStreamReader(System.in);
		//Creating a buffer reader
		BufferedReader br = new BufferedReader(isr);
		
		int lenOfArr = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		for(int  i = lenOfArr-1; i>-1; i--)
		System.out.print(arr[i]+" ");
		
	}

}
