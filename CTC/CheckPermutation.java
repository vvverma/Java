/*
	Write a program to check if the two strings are permutations of each other- question from chatper 1 ctc

*/

class CheckPermutation
{
	static String sortString(String s1)
	{
		char swap;
		StringBuilder mod = new StringBuilder();
		char[] s = s1.toCharArray();
		for(int i = 0; i< s.length;i++)
		{
			for(int j = i+1; j<s.length; j++)
			{
				if(s[i]>= s[j])
					{
						swap = s[j];
						s[j] = s[i]; 
						s[i] = swap;
						System.out.println(s[i]);
					}
			
			}
		}
			for(char i : s)
				mod.append(i);
			System.out.println(mod.toString());
		return mod.toString();
		
	}
	
	public static void main(String args[])
	{
		String s1 = args[0];
		String s2 = args[1];
		
		//check length
		if(s1.length() == s2.length())
		{
			s1 = sortString(s1);
			s2 = sortString(s2);
			
			if (s1.equals(s2))
			System.out.println("The two words are the palindrome of each other");
			else
				System.out.println("The two words are not the palindrome of each other");
		
		}else
		System.out.println("The two words are not the palindrome of each other");
	
	}

}