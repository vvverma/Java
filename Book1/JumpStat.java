/*
* In this program we will demonstrate all the jump statements in Java
* 	The jump statements are break
* 							continue
* 							return 
* 							exit();
* 							
* 	The program is written to print all the vowels in the name
* 	also count the number of consonants in the array 
* 							
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/


class JumpStat
{
	public static void main(String ...args)
	{
		char[] word = args[0].toLowerCase().toCharArray();
		int consNum = printVowels(word);
		printConsonents(word);
		System.out.println("The number of consonants in the word " +args[0]+" are "+ consNum);
	}

	public static int printVowels(char[] word)
	{
		int consNumCount=0;
		for(char let : word)
		{
			if((let == 'a')|(let == 'e')|(let == 'i')|(let == 'o')|(let == 'u'))
				System.out.print(let+ " ");
			else
				consNumCount ++;
		}
		System.out.println(" ");
	return consNumCount;
	}
	
	public static void printConsonents(char[] word)
	{
		for(char let : word)
		{
			if((let == 'a')|(let == 'e')|(let == 'i')|(let == 'o')|(let == 'u'))
				continue;
			else
				System.out.print(let+ " ");
		}
		
	}
}
