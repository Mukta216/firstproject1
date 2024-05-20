
public class Company {

	public static void main(String[] args) {
		Department d = new Department(); 
		Department d1 = new Department(); 

		d.dept_id=10;
		d.dept_name="telecom";
		d.no_of_emp= 1000;
		
		d.add_dept();
		d.change_dept();
		
		d1.dept_id=30;
		d1.dept_name="IT";
		d1.no_of_emp= 5000;
		
		d1.add_dept();
		d1.change_dept();
		
		System.out.println("department id is" +d.dept_id);
		System.out.println("department name is" +d.dept_name);
		System.out.println("no_of_emp are" +d.no_of_emp);

		System.out.println("department id is" +d1.dept_id);
		System.out.println("department name is" +d1.dept_name);
		System.out.println("no_of_emp are" +d1.no_of_emp);

	}

}
