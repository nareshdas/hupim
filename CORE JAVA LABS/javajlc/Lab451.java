public class Lab451{
public static void main(String args[]){
Student st1=new Student(99,"Sri");
Student st2=new Student(99,"Sri");
Student st3=new Student(88,"manish");
Student st4=st1;

System.out.println("using==op");
System.out.println(st1==st2);
System.out.println(st1==st3);
System.out.println(st1==st4);
System.out.println(st2==st3);

System.out.println("using equals()");
System.out.println(st1.equals(st2));
System.out.println(st1.equals(st3));
System.out.println(st1.equals(st4));
System.out.println(st2.equals(st3));
}
}
class Student{
int sid ;
String name;
Student(int sid,String name){
this.sid=sid;
this.name=name;
}
public boolean equals(Object obj){
if(obj instanceof Student){
Student st=(Student)obj;
return this.sid==st.sid && this.name.equals(st.name);
}
return false;
}
}



