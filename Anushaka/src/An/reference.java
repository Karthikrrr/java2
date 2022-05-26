package An;

import java.util.HashMap;
import java.util.Scanner;

public class reference {
	static HashMap<String,Integer> ref=new  HashMap<String,Integer>();
Scanner scn=new Scanner(System.in);
		public void searchrefbko()
		{
		System.out.print("enete ekwy");
		String str=scn.nextLine();
		if(ref.containsKey(str))
		{
			System.out.print(ref.get(str));
		}
	
		}
}
