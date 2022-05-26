package An;
import java.util.*;
public class Catalog {
	static HashMap<String,Integer> hm=new  HashMap<String,Integer>();
	Scanner scn=new Scanner(System.in);
	public void UpdateInfo()
	{
	
	System.out.print("enter another name");
	String authorname=scn.nextLine();
	System.out.print("enter another name");
	int noofcopies=scn.nextInt();
	hm.put(authorname,noofcopies);
	System.out.print(hm);

	}
public void search()
{
	
	System.out.print("enete ekwy");
String str=scn.nextLine();
if(hm.containsKey(str))
{
	System.out.print(hm.get(str));
}
}
}

