interface Inter1{
void m1();
public abstract void m2();
int A=10;
public final int B=20;
}
abstract class Hello implements Inter1{
 public void m1()
{
System.out.println("Hello>>>m1:"+A);
}
}
class Hai extends Hello{
public void m2(){
System.out.println("Hello>>>>>m2:"+B);
}
void m3(){
System.out.println("Hai>>>>m3()");
}
}
class Lab415{
public static void main(String args[]){
Inter1 ref=new Hai();
//ref=new Inter1();
//ref=new Hello();
ref.m1();

ref.m2();
//ref.m3();


}
}
