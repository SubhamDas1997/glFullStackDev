package departments;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName() {
		String s1 = "Tech Department";
		return s1;
	}
	
	public String getTodaysWork() {
		String s2 = "Complete coding of module 1";
		return s2;
	}
	
	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}
	
	public String getTechStackInformation() {
		String s4 = "core Java";
		return s4;
	}
}