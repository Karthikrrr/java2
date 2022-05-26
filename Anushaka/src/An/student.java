package An;

import java.util.*;
import java.util.Scanner;

public class student {
	HashMap<String,String> stud=new HashMap<String,String>();
	Scanner sc=new Scanner(System.in);
	public void checkoutbko()
	{
		
	System.out.print("enter sname");
	String sname=sc.nextLine();
	System.out.print("enter studentcoll");
	String studentcoll=sc.nextLine();
	stud.put(sname,studentcoll);
	
	System.out.print("enter student name");
	String x=sc.nextLine();
	if(stud.containsKey(x))
	{
		System.out.print(stud.get(x));
	}
	}
	public void returnbko()
	{
		System.out.print("enter student name");
		String x=sc.nextLine();
		if(stud.containsKey(x))
		{
			System.out.print(stud.remove(x));
		}
	}
	
}
