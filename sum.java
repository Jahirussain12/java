import java.io.*;
import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int a,b,c;
	    System.out.println("enter the added number"); 
		
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a+b;
		System.out.println("add :"+c);
         
         
	    System.out.println("enter the subraction number"); 
		
		Scanner op=new Scanner(System.in);
		a=op.nextInt();
		b=op.nextInt();
		c=a-b;
		System.out.println("sub :"+c);
		
		System.out.println("enter the multi number :");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("multi :"+c);
		
		 System.out.println("enter the division number"); 
		
		Scanner cs=new Scanner(System.in);
		a=cs.nextInt();
		b=cs.nextInt();
		c=a/b;
		System.out.println("div :"+c);
		
		 System.out.println("enter the modlus number"); 
		
		Scanner se=new Scanner(System.in);
		a=se.nextInt();
		b=se.nextInt();
		c=a%b;
		System.out.println("mod :"+c);
		
	} 
}
