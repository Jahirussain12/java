import java.io.*;
import java .util.Scanner;
class atm
{
	public static void main(String args[])
	{
		int bin,withdraw,deposite,balance=200000,card=7449,accound ,input,a,b;
		System.out.println("WELCOME TO OUR BANK ");
		System.out.println("please enter the bin number");
		Scanner in=new Scanner(System.in);
		bin=in.nextInt();
        while(bin!=1234)
		{
			System.out.println("please enter currect bin");
			bin=in.nextInt();
		}
        System.out.println("your bin is currect");
		
	    System.out.println("1.withdraw");
		System.out.println("2.deposite");
		System.out.println("3.balance");
		System.out.println("4.trnasfer amount");
		System.out.println("5.exit");
		System.out.print("please enter your choice");
		int n=in.nextInt();
	    switch(n)
		{
			case 1:
			System.out.print("enter your withdraw amount");
			withdraw=in.nextInt();
			balance=withdraw-balance;
			if(withdraw>balance)
			{
			System.out.println("please enter less amount in 2 lakhs ");
			withdraw=in.nextInt();
			
			//if(withdraw>balance)
			
			System.out.println("amound added sucessfully");
		     balance=withdraw-balance;
			System.out.print("total:"+withdraw);
			}
			break;
			case 2:
			System.out.print("please enter your deposite amount ");
			deposite=in.nextInt();
			if(deposite<balance)
			{
			balance=deposite+balance;
			System.out.print("your total amount is"+balance);
			}
			System.out.print("your deposite amount is :"+deposite);
			break;
			case 3:
			System.out.println("3. balance");
            System.out.print("your balance is :"+balance);
		    System.out.println("thank you");
            break;
			case 4:
			System.out.println("to card :click a");
			System.out.println("to accound :click b");
			a=in.nextInt();
			b=in.nextInt();
			
			/*while(input==a)
			{
        
			if(input==a)
				{
				System.out.println("enter card bumber");
				card=in.nextInt();
				System.out.print("ender accound number ");
				accound =in.nextInt();
				System.out.print("enter deposite amound");
				deposite=in.nextInt();
				System.out.print("your deposite amount is"+deposite);
				balance=deposite+balance;
				System.out.print("your total amound is"+deposite);
				}
			
		     if(input==a)
		     
			{
				System.out.println("you entered worng bin");
				System.out.println("plese enter currect bin ");
				card=in.nextInt();
			}
		    }
			while(input==b)
			{
				if(input==b)
				{
				System.out.println("enter accound number");
				accound=in.nextInt();
				System.out.println("enter deposite amound");
				deposite=in.nextInt();
				System.out.print("your deposite amound is :"+deposite);
				}
			
			 if(input==b)
			{
				System.out.println("enter 16 digit number");
				accound=in.nextInt();
			}
			}*/
           break;
		   case 5:
				System.out.print("THANK YOU");
	
			break;
			default:System.out.print("enter currect choice");
	        
		
	}
}      }    