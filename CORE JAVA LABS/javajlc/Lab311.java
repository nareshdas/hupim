class Lab311{
public static void main(String args[]){
Hello h=new Hello();
h.sum(12,23);
h.sum(12,32,43);
}
}
class Hello{
void sum(int a,int b){
System.out.println("sum");
System.out.println(a+b);
}
void sum(int a,int b,int c){
System.out.println("sum 2");
System.out.println(a+b+c);
}

}