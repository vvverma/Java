/*
This program is from book3 chapter 10

*/
class X {
public void foo() {
 System.out.println("A");
}
}
public class ExceptionClassThrows2 extends X{
public void foo()throws Exception{
super.foo(); 
throw new Exception("B");
}
public static void main(String ...args) {
try{
new ExceptionClassThrows2().foo();
}
catch(Exception e)
{
System.out.println("ex");
}
}
}