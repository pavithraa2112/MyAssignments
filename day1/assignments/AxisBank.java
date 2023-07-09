package week3.day1.assignments;

public class AxisBank {
	public void deposit() {
		System.out.println("deposit() from AxisBank");
}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		
		BankInfo b = new BankInfo();
		b.deposit();
	}
}
