package abstraction;

public class User {

	public static void main(String[] args) {
		
		RBI ref;
		ref= new HDFC();
		ref.savingAcc();
		ref.currentAcc();
		ref.creditCard();
		ref.debitCard();
		
		ref= new CITY();
		ref.savingAcc();
		ref.currentAcc();
		ref.creditCard();
		ref.debitCard();
		
		ref= new SBI();
		ref.savingAcc();
		ref.currentAcc();
		ref.creditCard();
		ref.debitCard();
		
	}

}
