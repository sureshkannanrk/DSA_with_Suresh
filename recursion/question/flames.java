package question;
import java.util.Scanner;
import java.util.ArrayList;

public class flames {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a boyname:");
		String boyname =sc.next();
		System.out.println("enter a girl name:");
		String girlname =sc.next();
		namematches(boyname,girlname);
		sc.close();
	}
	public static void namematches(String boy, String girl)
	{
		int not_match =boy.length()+girl.length();
		char girlname[] = girl.toCharArray();
		for(int i=0;i<boy.length();i++)
		{
			boolean flag =true;
			for(int j=0;j<girl.length();j++)
			{
				
				if(boy.charAt(i) == girlname[j])
				{
					if(flag)
					{
						not_match=not_match-2;
						flag = false;
					}
					else
					{
						not_match--;
					}
					girlname[j]='*';
				}
			}
		}
		System.out.println(not_match);
		ArrayList<Character> flame =new ArrayList<>();
		flame.add('f');
		flame.add('l');
		flame.add('a');
		flame.add('m');
		flame.add('e');
		flame.add('s');
		org_flames(not_match, flame);
		System.out.print(flame.get(0));
	}
	public static void org_flames(int not_match, ArrayList<Character> list)
	{
		if(list.size()==1)
		{
			return;
		}
		int index =(not_match-1)%list.size();
		list.remove(index);
		int new_match=(list.size()+not_match);
		org_flames(new_match,list);
	}
}
