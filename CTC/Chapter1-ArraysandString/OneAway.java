/*
This programs demonstrate One Away program from CTC chapter number 1 
question number 1.6

*/


class OneAway{

static boolean editString(String original, String edited){
int ogLength = original.length();
int editLength = edited.length();
int notsame=0;
if((original == null) || (edited == null))
return false;

if(((ogLength-editLength) == 1) || ((ogLength-editLength) == -1))
return true;

if(ogLength == editLength){
for(int i = 0 ; i < ogLength; i++){
if(original.charAt(i) != edited.charAt(i))
	++notsame;

}
}

if(notsame == 1){
return true;

}

return false;

} 


public static void main(String args[]){
boolean ans = editString(args[0], args[1]);
System.out.println(ans);
}

}