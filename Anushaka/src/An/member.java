package An;
import java.util.*;
public class member {
	Scanner sc=new Scanner(System.in);
	HashMap<String,String> man=new HashMap<String,String>();
	public void mrequestforbko()
	{
		
		System.out.print("enter mname");
		String mname=sc.nextLine();
		System.out.print("enter maddress");
		String maddress=sc.nextLine();
		System.out.print("mno");
		int mno=sc.nextInt();
		System.out.print("enter boookname");
		String bookname=sc.nextLine();
		man.put(mname, bookname);
		
	}
	public void mreturnbko()
	{
		
		
		System.out.print("enter mname");
		String x=sc.nextLine();
			
		if(man.containsKey(x))
		{
		man.remove(x);
		}
	}
	
}
