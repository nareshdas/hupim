class Lab309{
public static void main(String args[]){
Hai hai=new Hai();
hai.a=99;
Hello hello=new Hello();
System.out.println("main begin:"+hai.a);
hello.m1(hai);
System.out.println("main end:"+hai.a);
}
}
class Hello{
void m1(Hai hai){
System.out.println("m1 begin:"+hai.a);
hai=new Hai();
hai.a=hai.a+10;
System.out.println("m1 end:"+hai.a);
}
}
class Hai{
int a;
}
