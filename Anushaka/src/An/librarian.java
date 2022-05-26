package An;
import java.util.*;
public class librarian {
	HashMap<String,String> info=new HashMap<String,String>();
	Scanner sc=new Scanner(System.in);
	public void updateinfo()
	{
		
		System.out.print("enter name");
		String name=sc.nextLine();
		System.out.print("enter address");
		String address=sc.nextLine();
		System.out.print("mobileno");
		int mobileno=sc.nextInt();
		info.put(name,address);
		
	}
	public void issuebooks()
	{
	System.out.print(info);	
	}
	public void memberinfo()
	{
	System.out.print(info);		
	}
	public void searchbko()
	{

		System.out.print("enter name");
		String x=sc.nextLine();
		if(info.containsKey(x))
		{
			System.out.print(info.get(x));
		}
	}
	public void returnbko()
	{
		System.out.print("enter name");
		String x=sc.nextLine();
		if(info.containsKey(x))
		{
			System.out.print(info.get(x));
		}
	}
	


}
