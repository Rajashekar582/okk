package bank_approve;

import java.util.Scanner;

interface info {
	      public void aplication(String g);
               }

public class mainf implements info {
	      public void clerkverification(boolean m){c=m;}
	      public boolean getveri() {return this.c;}
	      public void deputyv(boolean m){ this.Do=m;}
	      public boolean deputyapprove() {return this.Do;}

	      public void aplication(String d)
	                           {String k=d;{System.out.println("request infooo is "+k);}}
	      public String getrequest() 
	                    {return k;}
public  mainf(String j){k=j;}

public mainf() {
	
}

public static String k;
private  boolean c=false; 
private  boolean Do=false;
	      
public static void main(String args[]) { 
	                 Scanner h=new Scanner(System.in);
	                 System.out.println("enter ur application request----");
	                 System.out.println("typeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		             String t=h.nextLine();
		             info f=new mainf(t);
		             f.aplication(t);
		             System.out.println("enter clerk verify code:");
		              String c=h.next();
		              if(c.contentEquals(clerk_check.ccode())) 
		              { clerk_check.dataverification();}
		              System.out.println("enter deputy verify code:");
		              String d=h.next();
		              if(d.contentEquals(Deputy_check.dcode())) {
		              Deputy_check.deputy();}
		              else {System.out.println("clerk and deputy not aproved");}
		             officer_approvel.officer();
		            h.close();
		            
	}

}
