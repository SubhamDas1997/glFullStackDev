//Creating under 'departments' package
package departments;

//Creating 'TechDepartment' class which has 'SuperDepartment' as its superclass
public class TechDepartment extends SuperDepartment{
	
	//Creating 'departmentName' method which returns string
	public String departmentName() {
		//Initialising string
		String s1 = "Tech Department";
		//Returning string
		return s1;
	}
	
	//Creating 'getTodaysWork' method which returns string
	public String getTodaysWork() {
		String s2 = "Complete coding of module 1";
		return s2;
	}
	
	//Creating 'getWorkDeadline' method which returns string
	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}
	
	//Creating 'doActivity' method which returns string
	public String getTechStackInformation() {
		String s4 = "core Java";
		return s4;
	}
}