/*
*This program demonstrates about the implementation of enumeration classes
*
*Rules--
*1) Cannot instantiate enum class
*2) First line in enum should not be any variable or method declaration
*3) Constructors of enum can only be private not public/protected
*4) Cannot be declared inside a method but can be inside or outside or other class
*5) Can be compared using == or != or equals()
*6) Switch label must be qualified name of the enumeration constant
*7) May have main method
*
* @author  Vishal Verma
* @version 1.0
* @since   JDK 1.8.0 
*
*/

enum Fruits{
Orange("ORANGE"), Watermelon("GREEN"), grapes("BLACK");
private String color;
// by default constructor is private
 private Fruits(String color){
this.color = color;
}

//the function is implemented to access private string
public String getColor(){
return color;
}
}

class EnumClass{

public static void main(String args[]){
Fruits f = Fruits.Orange;
Fruits f1 = Fruits.Orange;
Fruits f2 = Fruits.Watermelon;
if(f1 == f)
System.out.println(f.name()+"  "+ f.ordinal()+ " "+ f.getColor());

 if(f2!=f)
System.out.println(f2.name()+"  "+ f2.ordinal()+ " "+ f2.getColor());

 if(f1.equals(f2))
System.out.println(f2.name()+"  "+ f2.ordinal()+ " "+ f2.getColor());
}
}
