class Hello implements Inter1, Inter2{
public void m1(){
System.out.println("Hello>>>>>>>>>>>>m1");
}
public void m2(){
System.out.println("Helllll>>>>m2");
}
public void m3(){
System.out.println("Hellllooo>>>m3");
System.out.println(Inter1.A);
System.out.println(Inter2.A);
System.out.println(B);
System.out.println(C);
}
}
class Lab418{
public static void main(String args[]){
Hello h=new Hello();
Inter1 ref1=h;
ref1.m1();

ref1.m2();
Inter ref2=h;
ref2.m2();
ref2.m3();

}}