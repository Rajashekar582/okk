package bank_approve;

public class Deputy_check {
	public static String dcode() {String d="123";return d;}
public static void deputy(){
   
	mainf f=new mainf();
    if(f.getveri()==true)	         // if(mainf.getveri()==true)                
    {
	System.out.println(mainf.k+" is verified by Deputy");
	mainf d=new mainf();
	d.deputyv(true);
	}else 
	{System.out.println("not approved");}
}}
