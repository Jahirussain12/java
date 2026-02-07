import  java.io.*;
import java.util.Scanner;
class table
{
	public static void main(String args[])
	{
		int a,b;
	    Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		b=input.nextInt();
		//input.close();
		for(a =1; a <=20; a++)
		{
			System.out.printf("%d * %d =  %d  \n ", a, b,(a * b) );
		}
	}
}
