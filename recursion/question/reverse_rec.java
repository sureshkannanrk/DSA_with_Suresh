package question;
import java.util.Scanner;

public class reverse_rec {
	public static void main(String[] args)
	{
		System.out.print("Enter the number:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		pv_func(num,1);
		sc.close();
	}
	public static void pv_func(int num,int level)
	{
		int new_num=num;
		System.out.println(0);
		
		int rev_num=reve(num);
		
		if(new_num == rev_num)
		{
			System.out.println(rev_num);
			System.out.print(level);
			return;
		}
		else
		{
			int index= (rev_num+1) % 10==0 ?  rev_num+2  : rev_num+1;
			pv_func(   index, level+1);
		}
	}
	
	public static int reve(int num)
	{
		
		int rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
		
	}
}
