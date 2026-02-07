import java.util.Scanner;
class NotEligibleException extends Exception{
NotEligibleException(String msg){
super(msg);
}
}
class VoterList{
int age;
VoterList(int age)
{
this.age=age;
}
void checkEligibility()
{
try
{
if(age<18)
{
throw new NotEligibleException("error:NotEligible for vote due to under age");
}
System.out.println("Contrages! You are eligible for vote.");
}
catch(NotEligibleException nee)
{
	System.out.println(nee.getMessage());
}
}
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("enter your age in year");
int age=input.nextInt();
VoterList person=new VoterList(age);
person.checkEligibility();
}
}