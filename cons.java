import java.io.*;
class cons
{
public static void main(String args[])

	{
		
		Console c=System.console();
		System.out.println(" your 1 number");
		int a=Integer.parseInt(c.readLine());
		System.out.print("your 2 number :");
		int b=Integer.parseInt(c.readLine());
		int d=a+b;
		System.out.print("total :"+d);
	}

	
}
