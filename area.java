import java.util.Scanner;
class shape
{
	float findarea(float l,int b)
	{
		return l*b;
	}
	int findarea(int b,int h)
	{
		return (int)0.5*b*h;
	}
	float findarea(float j,float v)
	{
		return (float)j*v;
	}
}
class area
{
	public static void main(String args[])
	{
		shape obj=new shape();
		Scanner in=new Scanner(System.in);
		System.out.println(" to find the area of rectengle");
		System.out.println("enter lenght :  ");
		float l=in.nextFloat();
		System.out.println("enter breath :  ");
        int b=in.nextInt();
        System.out.println("area of rectangle =  "+obj.findarea(l, b));
		System.out.println("to find area of tirangle ");
		System.out.println("enter breath : ");
		 b=in.nextInt();
		System.out.println("enter height  : ");
		int h=in.nextInt();
		System.out.println("area of tirangle =  "+obj.findarea(b, h));
		System.out.println("to find the area of square");
		System.out.println("enter side 1 :  ");
		 float j=in.nextFloat();
		System.out.println("enter side 2 : ");
		 float v=in.nextFloat();
		System.out.print("area of square = "+obj.findarea(j, v));
	}
}	