import java.io.*;
class buf
{
 public static void main(String args[])
 throws Exception
 
 {
	 int a,b,c;
	 InputStreamReader in=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(in);
	 System.out.println("enter the number");
	  a=Integer.parseInt(br.readLine ());
	  b=Integer.parseInt(br.readLine());
	 c=a+b;
	 System.out.print("your namber is:"+c);
	 
	/* System.out.println("enter float number");
	 float b=Float.valueOf(br.readLine()).floatValue();
	 System.out.print("your float is :"+b);
	 System.out.println("enter string");
	 String str=br.readLine();
	 System.out.print("string is:"+str);*/
	 
 }
}
