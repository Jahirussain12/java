 import java.io.*;
 class animal
{
    void sound();
    void color();
}
 class Cat implements Animal
{
    void sound ()
    {
        System.out.println("meow");
    }
    void color()
    {
        System.out.println("black");
    }
   
}
class main
{
    public static void main (String args[])
    {
        Cat c=new Cat();
        c.sound();
        c.color();
    }
}