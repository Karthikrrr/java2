package An;
import An.*;
import java.util.Scanner;
import java.util.*;
	public class mains 
	{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
	alert a=new alert();
	books b=new books();
	facultymember f=new facultymember();
	general g=new general();
	librarian l=new librarian();
	member m=new member();
	reference r=new reference();
	student s=new student();
	
	Catalog c=new Catalog();
	

	
	System.out.println("1.catalog");
	System.out.println("2.alert");
	System.out.println("3.books");
	System.out.println("4.facultymember");
	System.out.println("5.general");
	System.out.println("6.librarian");
	System.out.println("7.member");
System.out.println("8.reference");
System.out.println("9.student");
System.out.println("enter choice");
	int ch=sc.nextInt();
	if( ch==1) {
		c.UpdateInfo();
		c.search();
		
	}
	if(ch==2) {
		a.finecal();
		a.viewAlert();
		a.sendtolibrarian();
		a.deletealertbyno();
	}
	if(ch==3) {
		b.remove();
		b.add();
	}
	if(ch==4) {
		f.checkoutbko();
	}
	if(ch==5) {
		
	}
	if(ch==6)
	{
		l.issuebooks();
		l.memberinfo();
		l.searchbko();
		l.returnbko();
	}
	if(ch==7)
	{
		m.mrequestforbko();
		m.mreturnbko();
	}
	if(ch==8)
	{
		r.searchrefbko();
	}
	if(ch==9)
	{
		s.checkoutbko();
		s.returnbko();
	}
		
	}
}
