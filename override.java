import java.io.*;
class student
{
	int rollno,age;
	String name;
	student(int r,int a,String n)
	{
		rollno=r;
		age=a;
		name=n;
	}
	void output()
	{
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("rollno :"+rollno);
	}
}
class student1 extends student
{
	double wight,height;
	student1(String n,int r,int a,double w,double h)
	{
		super(r,a,n);
		wight=w;
		height=h;
	}
	void output()
	{
		System.out.println("name :"+name);
		System.out.println("wight :"+wight);
		System.out.println("height :"+height);
	}
}
class override
{
	public static void main(String args[])
	{
		student1 obj=new student1("mohan",111,25,40,6.5);
		obj.output();
	}
}