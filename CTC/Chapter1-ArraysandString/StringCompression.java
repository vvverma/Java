/*
* This program demonstrates string compression. This question is from CTC
* question number 1.6
* 
* 
* 
*  @author  Vishal Verma
*  @version 1.0
*  @since   JDK 1.8.0
* 
*/
import java.util.*;

class StringCompression{
static String compress(String s){
ArrayList<Character> ch = new ArrayList<Character>(); 
ArrayList<String> count = new ArrayList<String>();
StringBuilder str = new StringBuilder();
char[] input = s.toCharArray();
int i =0, j=1, countVal = 1;
while(i < input.length){
ch.add(input[i]);
while((j <input.length) && (input[i] == input[j])){
	countVal++;
	i++;
	j++;
}
	count.add(Integer.toString(countVal));
	i = j ;
	j= i+1;
	countVal = 1;
}
System.out.println(ch);
System.out.println(count);

for(i = 0 ;i < ch.size(); i++){
	str.append(ch.get(i));
	str.append(count.get(i));
}
System.out.println(str.toString());

return str.toString();
}


static String compareLength(String comp, String s){
if (comp.length() < s.length())
return comp;
else 
return s;
}


public static void main(String[] args){
String compressed = compress(args[0]);
String answer = compareLength(compressed,args[0]);
System.out.println(answer);
}

}
