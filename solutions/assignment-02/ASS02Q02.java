class BillWithoutGates {
	private String phno;
	private String name;
	private double hire_charge = 100.25;
	private double unit_consumed;
	private double bill_amount;
	
	public BillWithoutGates(String phno, String name, double unit_consumed){
		this.phno = phno;
		this.name = name;
		this.unit_consumed = unit_consumed;
	}
	
	public void calcBill(){
		double total = hire_charge;
		if (unit_consumed <= 100) {
			total = total + 1.0*unit_consumed;
		}
		else if (unit_consumed > 100 && unit_consumed <=200) {
			total = total + 1.0*100 + 1.5*(unit_consumed-100);
		}
		else {
			total = total + 1.0*100 + 1.5*100 + 2*(unit_consumed - 200);
		}
		bill_amount = total;
	}
	
	public void display(){
		System.out.println("Phone Number : "+phno);
		System.out.println("Name : "+name);
		System.out.println("Hire Charge : "+hire_charge);
		System.out.println("Units Consumed : "+unit_consumed);
		System.out.println("Bill Amount : Rs. "+bill_amount);
	}
	
	public static void main(String args[]){
		BillWithoutGates tbill = new BillWithoutGates("1234567890", "Mukesh Modi", 100);
		tbill.calcBill();
		tbill.display();
	}
}
