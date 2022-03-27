//Creating under 'departments' package
package departments;

//Creating 'SuperDepartment' class (superclass)
public class SuperDepartment {
	
	//Creating 'departmentName' method which returns string
	public String departmentName() {
		//Initialising string
		String s1 = "Super Department"; 
		//Returning string
		return s1; 
	}

	//Creating 'getTodaysWork' method which returns string
	public String getTodaysWork() {
		String s2 = "No Work as of now";
		return s2;
	}
	
	//Creating 'getWorkDeadline' method which returns string
	public String getWorkDeadline() {
		String s3 = "Nil";
		return s3;
	}
	
	//Creating 'isTodayAHoliday' method which returns string
	public String isTodayAHoliday() {
		String s4 = "Today is not a holiday";
		return s4;
	}
}