package a;

//-----------class-----: encapsulation , abstarction ? read about
// head first core java,thiking in java burce, notes : yet anothor prog ins notes
//https://www3.ntu.edu.sg/home/ehchua/programming/index.html

class Employee{
	private  int id;
	private String name;
	private double salary;
	
	private static String companyName="Harman";
	
	//static metohd can be called without the object of that class
	public static String getCompanyName() {
		return companyName;
	}
	//ctr
	public Employee() {
		this(0,"foo",0.0);
	}
							//local variable
	public Employee(int id, String name, double salary) {
	
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	 public void print() {
		 System.out.println("id : "+ id+ " name : "+ name+" salary: "+ salary+" companyName: "+ companyName);
	 }
}
public class E_EmployeeDemo {

	public static void main(String[] args) {
		Employee e1=new Employee(7, "raja", 78000.00);
		
		Employee e2=new Employee(70, "anil", 58000.00);
		
		
		System.out.println(Employee.getCompanyName());
		
		System.out.println(Employee.getCompanyName());
		
	}
}
