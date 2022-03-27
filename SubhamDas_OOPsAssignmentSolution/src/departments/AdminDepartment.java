//Creating under 'departments' package
package departments;

//Creating 'AdminDepartment' class which has 'SuperDepartment' as its superclass
public class AdminDepartment extends SuperDepartment {
	
	//Creating 'departmentName' method which returns string
	public String departmentName() {
		//Initialising string
		String s1 = "Admin Department"; 
		//Returning string
		return s1; 
	}
	
	//Creating 'getTodaysWork' method which returns string
	public String getTodaysWork() {
		String s2 = "Complete your documents Submission";
		return s2;
	}
	
	//Creating 'getWorkDeadline' method which returns string
	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}
}