//Basic parent class to store variables. The salary() function of this class is overrided in every child class
class Employee {
	protected String id;
	protected String name;
	protected double basic;
	protected double hra;
	protected double da;
	protected double salary;

	public void salary(){
	}
}

//Different employee types
class Manager extends Employee {
	Manager(String ID, String NAME, double BASIC){
		id = ID;
		name = NAME;
		basic = BASIC;
	}
	public void salary(){
		hra = 0.04*basic;
		da = 0.05*basic;
		salary = basic + hra + da;
	}

	public void display(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}

class Clerk extends Employee {
	protected double dailyrate;
	protected double overtime;
	Clerk(String ID, String NAME, double DAILYRATE, double OVERTIME){
		dailyrate = DAILYRATE;
		overtime = OVERTIME;
		name = NAME;
		id = ID;
	}
	public void salary(){
		salary = dailyrate + overtime;
	}

	public void display(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}

class Officer extends Employee {
	Officer(String ID, String NAME, double BASIC, double HRA){
		id = ID;
		name = NAME;
		basic = BASIC;
		hra = HRA;
	}
	public void salary(){
		da = 0.02*basic;
		salary = basic + hra + da;
	}

	public void display(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
	}
}

class Main {
	public static void main(String[] args) {
		Manager m = new Manager("M01", "John Doe", 5000);
		Clerk c = new Clerk("C01", "Clerk Doe", 2000, 900);
		Officer o = new Officer("O01", "Officer Doe", 25000, 5000);
		m.salary();
		c.salary();
		o.salary();
		m.display();
		c.display();
		o.display();
	}
}
