import java.io.*;
import java.util.Scanner;
class add
{
    int a,b,c;	
	public static void main(String args[])
	{
		
		c=a+b;
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.print("total:"+c);
	}
}
		