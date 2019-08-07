package entities;

public class Account {
	private int account;
	private String name;
	private double money;
	
	public int getAccount() {
		return account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public Account(int account, String name) {
		this.account = account;
		this.name = name;
	}

	public Account(int account, String name, double initialDeposit) {
		this.account = account;
		this.name = name;
		depositValue(initialDeposit);
	}
		
	public void depositValue(double money) {
		this.money += money;
	}
	
	public void withdrawValue(double money) {
		this.money -= money + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ String.format("%d", account)
				+ ", "
				+ "Holder: "
				+ name
				+ ", "
				+ "Balance: "
				+ String.format("%.2f", getMoney());
	}	
}
