/*
Coding question form Cracking the coding interview chapter arraylist and Strings using HashMap
*/
import java.util.*;

class UniqueChar2
{
	public static void main(String ...args)
	{
		boolean[] b = new boolean[128]; // only ASCII characters
		boolean flag =true;
		String inputString = args[0];
		
		for(int i= 0 ; i<inputString.length();i++)
		{
			int checker = inputString.charAt(i);
			if(b[checker])
			{
				flag = false;
				break;
			}
			b[checker] = true;
		}
		
		if(flag == false)
			System.out.println("The given string has unique character");
		else
			System.out.println("The given string does not have unique character"+b[0]);
	
	}


}