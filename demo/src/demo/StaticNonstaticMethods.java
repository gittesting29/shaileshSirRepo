package demo;

public class StaticNonstaticMethods {
	static int empId=789;
	double salary=8576576.7868;
	static int getEmpId() {
		System.out.println("Inside getEmpId.....");
		return empId;
	}
	double getSalary() {
		System.out.println("Inside getSalary().....");
		return salary;
	}
	
	public static void main(String[] args) {
		System.out.println("@@@@@@@@@@@@@@@@@ Inside main() @@@@@@@@@@@@@@@@@");
		int id= StaticNonstaticMethods.getEmpId();
		System.out.println("Employee ID : "+id);
		
		StaticNonstaticMethods obj= new StaticNonstaticMethods();
		double sal= obj.getSalary();
		System.out.println("Employee Salary  : "+sal);
	}

}
