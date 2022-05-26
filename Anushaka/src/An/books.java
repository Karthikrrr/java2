package An;

import java.util.*;

public class books {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	public void remove()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter authorname");
		String x=sc.nextLine();
		if(hm.containsKey(x))
		{
		hm.remove(x);
		}
	}
	public void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter authorname");
		String authorname=sc.nextLine();
		System.out.print("noofbooks");
		int noofbooks=sc.nextInt();	
		hm.put(authorname,noofbooks);
		
		
	}

}

