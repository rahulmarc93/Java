package employees;

public class Employee {
	static int eid;
	static String ename;
	static String companyname;
	
	
       static void display(int eid, String ename,String companyname ) 
       {
    	   System.out.println("Employee id is "+eid+" , "+ "Employee name is "+ename+" , "+"Company name is "+companyname);
       }
       
       
	public static void main(String[] args) {
		// Create employee details eid, ename, company name using static variable and static method
		display(1,"Rahulkumar","Atlassian");
		display(2,"Janhvi","Intuit");
		display(3,"Pratiksha","Atlassian");
	}
}