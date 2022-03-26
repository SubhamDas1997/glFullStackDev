package departments;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		String s1 = "Admin Department";
		return s1;
	}
	
	public String getTodaysWork() {
		String s2 = "Complete your documents Submission";
		return s2;
	}
	
	public String getWorkDeadline() {
		String s3 = "Complete by EOD";
		return s3;
	}
}