package An;
import java.util.*;
public class facultymember {
	HashMap<String,String> faculty=new HashMap<String,String>();
	public void checkoutbko()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter fname");
		String fname=sc.nextLine();
		System.out.print("enter facultycoll");
		String facultycoll=sc.nextLine();
		faculty.put(fname,facultycoll);
		System.out.print("enter fname");
		String x=sc.nextLine();
		if(faculty.containsKey(x))
		{
			System.out.print(faculty.get(x));
		}
		
		
	}
	
}
