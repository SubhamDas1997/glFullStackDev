//Creating under 'departments' package
package departments;

//Creating 'HrDepartment' class which has 'SuperDepartment' as its superclass
public class HrDepartment extends SuperDepartment{
	
	//Creating 'departmentName' method which returns string
	public String departmentName() {
		//Initialising string
		String s1 = "Hr Department"; 
		//Returning string
		return s1; 
	}
	
	//Creating 'getTodaysWork' method which returns string
	public String getTodaysWork() {
		String s2 = "Fill today’s worksheet and mark your attendance";
		return s2;
	}
	
	//Creating 'getWorkDeadline' method which returns string
	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}
	
	//Creating 'doActivity' method which returns string
	public String doActivity() {
		String s4 = "team Lunch";
		return s4;
	}
}