class Lab335{
public static void main(String args[]){
new Hello();
}
}
class Hai{
static int a=99;
static{
System.out.println("Hai>SB :"+a);
}
}
class Hello extends Hai{
static int b=88;
static {
System.out.println("Hello >SB:"+a);
System.out.println("Hello >SB:"+b);
}
}

