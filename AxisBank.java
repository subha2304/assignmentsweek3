package Bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("the deposit is 500");
	}
public static void main(String[] args) {
AxisBank money = new AxisBank();
money.deposit();
money.saving();
money.fixed();
}
}
