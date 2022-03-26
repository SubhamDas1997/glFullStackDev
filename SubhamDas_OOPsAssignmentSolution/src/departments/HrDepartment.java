package departments;

public class HrDepartment extends SuperDepartment{
	
	public String departmentName() {
		String s1 = "Hr Department";
		return s1;
	}
	
	public String getTodaysWork() {
		String s2 = "Fill today’s worksheet and mark your attendance";
		return s2;
	}
	
	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}
	
	public String doActivity() {
		String s4 = "team Lunch";
		return s4;
	}
}