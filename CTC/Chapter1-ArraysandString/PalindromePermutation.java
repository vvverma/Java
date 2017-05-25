/*
This program demonstrates PalindromePermutation from CTC chapter 1 
question number 1.4 



*/

class PalindromePermutation{

static boolean isPalinPer(String s){
int a = buildFrequencyTable(s); 
if(a > 1)
return false; 
else 
return true;

}

//Hashtable
static int getNumber(char c){
int a = Character.getNumericValue('a');
int z = Character.getNumericValue('z');
int res = Character.getNumericValue(c);
//System.out.println(a+" "+z+" "+res);
if((a<= res) && (z>= res)){
return (res-a);
} 
else 
return -1;
}

static int buildFrequencyTable(String s){
int[] frequencyTable = new int[(Character.getNumericValue('z') - Character.getNumericValue('a'))+1];
char[] st = s.toCharArray();
int oddCount=0;
for(char c : st){
int x = getNumber(c);
if(x != -1)
++frequencyTable[x];
}
for(int i : frequencyTable){
if((i%2) == 1)
++oddCount;
} 
return oddCount;
}


public static void main(String args[]){
System.out.println(isPalinPer(args[0]));
}
}