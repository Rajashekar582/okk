package Student_record;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;




public class finish {

	public static void main(String ar[]) throws SQLException, ClassNotFoundException {
		
		
	  int t=12;
	  Scanner sc=new Scanner(System.in);
	  
	
		while(!(t==0)) {
			System.out.println("press '1' ---to admin login");
			System.out.println("press '2' ---to accountent login");
			System.out.println("press '3' ---to student details");
			System.out.println("press '0' ---to close console");
			switch(t=sc.nextInt()){
				
//admin			
			case 1 :{   
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL", "root", "viswa1");
					System.out.println("Enter admin name");
					String q="admin";
				if(q.equals(sc.next()))
				{ System.out.println(" enter password");
				 String e="admin123";    
				 
				if (e.equals(sc.next()))
				{int a=1;
			       while(!(a==0)) {
				           
					
					
					     System.out.println("Add account--------------- enter '1'");
				         System.out.println("view student list--------- enter '2'");
				         System.out.println("change account details---- enter '3'");
				         System.out.println("change student details---- enter '4'");
				         System.out.println("for  logout--------------- enter '0'");
				        a=sc.nextInt();
				       
/*add student*/			if(a==1) {
	                                
	PreparedStatement ps1=con.prepareStatement("insert into account(name,password,email,contactno) values(?,?,?,?)");
	System.out.println("Name:");
	ps1.setString(1,sc.next());
	System.out.println("password:");
	ps1.setString(2,sc.next());
	System.out.println("Email:");
	ps1.setString(3,sc.next());
	System.out.println("mobile no:");
	ps1.setString(4,sc.next());
	int status = ps1.executeUpdate();
	System.out.println(" "+status);
	
 	
                                  }
/*view student*/					        if(a==2) {
				        	
				        	try{
								
								PreparedStatement ps2=con.prepareStatement("select * from student");
								ResultSet rs1=ps2.executeQuery();
								
								while(rs1.next()){
									
									System.out.print(" "+rs1.getInt("rollno"));
									System.out.print(" "+rs1.getString("name"));
									System.out.print(" "+rs1.getString("email"));
									System.out.print(" "+rs1.getString("course"));
									System.out.print(" "+rs1.getInt("fee"));
									System.out.print(" "+rs1.getInt("paid"));
									System.out.print(" "+rs1.getInt("due"));
									System.out.print(" "+rs1.getString("address"));
									System.out.print(" "+rs1.getString("city"));
									System.out.print(" "+rs1.getString("state"));
									System.out.print(" "+rs1.getString("country"));
									System.out.println(" "+rs1.getString("contactno"));
									
								}
								
							}catch(Exception e1){System.out.println(e1);
				        	
				        }}
/*change acountent details*/					        if(a==3) { 														
				        
				        	PreparedStatement ps3=con.prepareStatement("update account set name=?,password=?,email=?,contactno=? where name=?");
							System.out.println("name:");
							String n=sc.next();
							ps3.setString(12,n);
							System.out.println("password:");
							ps3.setString(1,sc.next());
							System.out.println("email:");
							ps3.setString(2,sc.next());
							System.out.println("contactno:");
							ps3.setString(3, sc.next());
							System.out.println("fee:");
							ps3.setString(4,n);
				        	
				        }
				        
/*validate student*/					        if(a==4) {
	
	PreparedStatement ps1=con.prepareStatement("insert into student(name,email,course,fee,paid,due,address,city,state,country,contactno) values(?,?,?,?,?,?,?,?,?,?,?)");
	System.out.println("enter name of student--");
	ps1.setString(1,sc.next());
	System.out.println("enter Email--");
	ps1.setString(2,sc.next());
	System.out.println("enter course--");
	ps1.setString(3, sc.next());
	System.out.println("enter Fee--");
	ps1.setInt(4,sc.nextInt());
	System.out.println("enter Paid amount--");
	ps1.setInt(5,sc.nextInt());
	System.out.println("enter Due--");
	ps1.setInt(6,sc.nextInt());
	System.out.println("enter adresss--");
	ps1.setString(7,sc.next());
	System.out.println("enter city--");
	ps1.setString(8,sc.next());
	System.out.println("enter state--");
	ps1.setString(9,sc.next());
	System.out.println("enter country--");
	ps1.setString(10,sc.next());
	System.out.println("enter Mobile no--");
	ps1.setString(11,sc.next());
	int status=ps1.executeUpdate();
	System.out.println(" "+status);
                                        }
				         
				         
				         
				} }      else {System.out.println("invalid credentials");}}
				 }
				   
				    ;break;
					
				
//account			
			
			case 2 :  {  System.out.println("enter name:");
			String n=sc.next();
			System.out.println("enter password:");
			String p=sc.next();
				boolean status=false;
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","viswa1");
					
					PreparedStatement ps=con.prepareStatement("select * from mysql.account where name=? and password=?");
					ps.setString(1,n);
					ps.setString(2,p);
					ResultSet rs=ps.executeQuery();
					status=rs.next();
					if(status==true) {
						int t1=1;
					       while(!(t1==0)) {
						
						 System.out.println("Add student -------enter '1'");
				         System.out.println("validate student-------- enter '2'");
				         System.out.println("view student list -------enter '3'");
				         System.out.println("due students -------------enter '4'");
				         System.out.println("for  logout--------------- enter '0'");
				         t1=sc.nextInt();
		/*validate student*/		   if(t1==2)
						{ 
						
						PreparedStatement ps3=con.prepareStatement("update student set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,city=?,state=?,country=?,contactno=? where rollno=?");
						System.out.println("Roll no:");
						ps3.setInt(12,sc.nextInt());
						System.out.println("name:");
						ps3.setString(1,sc.next());
						System.out.println("email:");
						ps3.setString(2,sc.next());
						System.out.println("course:");
						ps3.setString(3, sc.next());
						System.out.println("fee:");
						ps3.setInt(4,sc.nextInt());
						System.out.println("paid:");
						ps3.setInt(5,sc.nextInt());
						System.out.println("Due:");
						ps3.setInt(6,sc.nextInt());
						System.out.println("adress:");
						ps3.setString(7,sc.next());
						System.out.println("city:");
						ps3.setString(8,sc.next());
						System.out.println("state:");
						ps3.setString(9,sc.next());
						System.out.println("country:");
						ps3.setString(10,sc.next());
						System.out.println("contact no:");
						ps3.setString(11,sc.next());
						int status1=ps.executeUpdate();
						System.out.println(" "+status1);
						
						}
				         
/*add student*/		    else if(t1==1) {
				    	PreparedStatement ps1=con.prepareStatement("insert into student(name,email,course,fee,paid,due,address,city,state,country,contactno) values(?,?,?,?,?,?,?,?,?,?,?)");
						ps1.setString(1,sc.next());
						ps1.setString(2,sc.next());
						ps1.setString(3, sc.next());
						ps1.setInt(4,sc.nextInt());
						ps1.setInt(5,sc.nextInt());
						ps1.setInt(6,sc.nextInt());
						ps1.setString(7,sc.next());
						ps1.setString(8,sc.next());
						ps1.setString(9,sc.next());
						ps1.setString(10,sc.next());
						ps1.setString(11,sc.next());
						int status2=ps1.executeUpdate();
						System.out.println(" "+status2);
							
						}
/*view student*/	else if(t1==3) {
							 
							
								try{
									
									PreparedStatement ps2=con.prepareStatement("select * from student");
									ResultSet rs1=ps2.executeQuery();
									while(rs1.next()){
										
										System.out.print(" "+rs1.getInt("rollno"));
										System.out.print(" "+rs1.getString("name"));
										System.out.print(" "+rs1.getString("email"));
										System.out.print(" "+rs1.getString("course"));
										System.out.print(" "+rs1.getInt("fee"));
										System.out.print(" "+rs1.getInt("paid"));
										System.out.print(" "+rs1.getInt("due"));
										System.out.print(" "+rs1.getString("address"));
										System.out.print(" "+rs1.getString("city"));
										System.out.print(" "+rs1.getString("state"));
										System.out.print(" "+rs1.getString("country"));
										System.out.println(" "+rs1.getString("contactno"));
										
									}
									
								}catch(Exception e){System.out.println(e);
						 }}
/*Due student*/		else if(t1==4) {
							 
							 PreparedStatement ps4=con.prepareStatement("select * from student where due>0");
								ResultSet rs4=ps4.executeQuery();
								while(rs.next()){
									
									System.out.print(" "+rs4.getInt("rollno"));
									System.out.print(" "+rs4.getString("name"));
									System.out.print(" "+rs4.getString("email"));
									System.out.print(" "+rs4.getString("course"));
									System.out.print(" "+rs4.getInt("fee"));
									System.out.print(" "+rs4.getInt("paid"));
									System.out.print(" "+rs4.getInt("due"));
									System.out.print(" "+rs4.getString("address"));
									System.out.print(" "+rs4.getString("city"));
									System.out.print(" "+rs4.getString("state"));
									System.out.print(" "+rs4.getString("country"));
									System.out.println(" "+rs4.getString("contactno"));
						 
						 }
						 }
					}}else {System.out.println("entered invalid credentials ");}
					
					
					
				}catch(Exception e1){System.out.println(e1);} } ;break;
					       
					
				
//student			
			case 3 :{System.out.println("enter your Rollno-- ");
			      Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","viswa1");
				 PreparedStatement ps=con.prepareStatement("select * from student where rollno=?");
			           ps.setInt(1, sc.nextInt());
				      ResultSet rs1=ps.executeQuery();
			       
			       while(rs1.next()){
						
						System.out.print(" "+rs1.getInt("rollno"));
						System.out.print(" "+rs1.getString("name"));
						System.out.print(" "+rs1.getString("email"));
						System.out.print(" "+rs1.getString("course"));
						System.out.print(" "+rs1.getInt("fee"));
						System.out.print(" "+rs1.getInt("paid"));
						System.out.print(" "+rs1.getInt("due"));
						System.out.print(" "+rs1.getString("address"));
						System.out.print(" "+rs1.getString("city"));
						System.out.print(" "+rs1.getString("state"));
						System.out.print(" "+rs1.getString("country"));
						System.out.println(" "+rs1.getString("contactno"));
			
			                                                }con.close();};break;
			    default : System.out.println("Unknown selction program terminated"); break;
			    
			 
			}
			
		} 
		
                 sc.close();	}

}
