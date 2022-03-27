//Creating under 'main' package
package main;

//importing all necessary classes under 'departments' package
import departments.AdminDepartment;
import departments.HrDepartment;
import departments.TechDepartment;

//Creating 'Driver' class
public class Driver {

	//Creating 'main' method
	public static void main(String[] args) {
		
		//Creating objects of required classes
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		AdminDepartment admin = new AdminDepartment();
		
		//Printing all functionalities of 'AdminDepartment' class
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		//Printing all functionalities of 'HrDepartment' class
		//Printing a blank line
		System.out.println();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		//Printing all functionalities of 'TechDepartment' class
		//Printing a blank line
		System.out.println();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}