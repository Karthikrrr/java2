package An;
import java.util.*;
public class alert {
	Scanner sc=new Scanner(System.in);
	HashMap<String,String> alerting=new HashMap<String,String>();
	public void finecal()
	{
		System.out.print("enter issuedate");
		String noofbook=sc.next();
		System.out.print("enter bookname");
		String bookname=sc.nextLine();
		System.out.print("returndate");
		String returndate= sc.next();
		
	}
	public void viewAlert()
	{
		System.out.print(alerting);
		System.out.print("enter bookname");
		String x=sc.nextLine();
		if(alerting.containsKey(x))
		{
			System.out.print(alerting.get(x));
		}
	}
	public void sendtolibrarian()
	{
		System.out.print(alerting);
	}
	public void deletealertbyno()
	{
		System.out.print("enter bookname");
		String x=sc.nextLine();
		if(alerting.containsKey(x))
		{
			System.out.print(alerting.remove(x));
		}
	}
	
	
}
