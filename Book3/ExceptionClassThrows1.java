/*
This program is from book3 chapter 10

*/
class A {
void foo() throws Exception {

 throw new Exception("A");

}
}

class B extends A {
void foo()throws Exception{
 throw new Exception("B");
}

}

class ExceptionClassThrows1{

public static void main(String ...args) throws Exception{
try{
new A().foo();

A a = new B();
a.foo();
}
catch(Exception e){
System.out.println(e);
e.printStackTrace();
}
finally{
new B().foo();

}
}
}