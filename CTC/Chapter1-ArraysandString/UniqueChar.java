/*
* Coding question form Cracking the coding interview chapter arraylist and Strings using HashMap
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/
import java.util.*;

class UniqueChar
{
	public static void main(String args[])
	{
		char[] s = args[0].toCharArray();
		HashMap<Integer,Character> hmap = new HashMap<Integer,Character>();
		boolean flag =true;
		
		for(int i = 0 ; i<s.length;i++)
		{
			if(hmap.containsValue(s[i]))
			{
				System.out.print(s[i]);
				flag = false;
				break;
			}
			else 
			hmap.put(i,s[i]);
		
		}
		  
	
		if(flag == false)
			System.out.println("The given string has unique character");
		else
			System.out.println("The given string does not have unique character");
	
	}


}
