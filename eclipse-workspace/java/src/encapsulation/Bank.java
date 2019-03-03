package encapsulation;

public class Bank {
	
	private int Balance;
	private String customerName;
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		if(balance>1000) {
			this.Balance= balance+150;
		}else if(balance<1000) {
			this.Balance=balance -500;
		}
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	 
	}
	
	 


