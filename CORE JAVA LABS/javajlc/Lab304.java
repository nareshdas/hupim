class Lab304{
public static void main(String args[]){
Hello h=new Hello();
h.show(null);
h.show("jlc");
h.show(h);
}
}
class Hello{
void show(String str){
System.out.println("show(String)");
}
void show(Object str){
System.out.println("show(object)");
}
}
