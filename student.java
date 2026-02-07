import java.io.*;
import java.util.*;
class mark
{
int m1;
int m2;
int m3;
int m4;
String name;
int rollno;
mark(int a,int b,int c,int d,int r,String n)
{
m1=a;
m2=b;
m3=c;
m3=d;
rollno=r;
name=n;
}
void display()
{
System.out.println("name :"+name);
System.out.println("rollno :"+rollno);
System.out.println("java :"+m1);
System.out.println("computer :"+m2);
System.out.println("data structure :"+m3);
System.out.println("maths :"+m4);
}
void tot()
{
int total;
total=m1+m2+m3+m4;
System.out.println("total:"+total);
}
}
class student
{
public static void main(String args[])throws IOException
{
//DataInputStream g=new DataInputStream(System.in);
Scanner obj=new Scanner(System.in);
int ma1;
int ma2;
int ma3;
int ma4;
int rollno;
String na;
System.out.println("enter your name:");
//na=g.readLine();
na=obj.next();
System.out.println("enter your rollno:");
//rollno=Integer.parseInt(g.readLine());
rollno=obj.nextInt();
System.out.println("enter your marks(java,computer,data structer,maths):");
//ma1=Integer.parseInt(g.readLine());
ma1=obj.nextInt();
//ma2=Integer.parseInt(g.readLine());
ma2=obj.nextInt();
//ma3=Integer.parseInt(g.readLine());
ma3=obj.nextInt();
//ma4=Integer.parseInt(g.readLine());
ma4=obj.nextInt();
mark o=new mark(ma1,ma2,ma3,ma4,rollno,na);
o.display();
o.tot();
}
}
