import java.io.*;
import java.util.Scanner;
class React
{
int lenght;
int breath;
}
class Rectangle extends React
{
int area;
void findArea()
{
area=lenght*breath;
}
}
class AreaRectangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
lenght=sc.nextInt();
breath=sc.nextInt();
System.out.print("area of rectangle is "+rectangle);
}
}
