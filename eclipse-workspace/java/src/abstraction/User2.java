package abstraction;



public class User2 {

	public static void main(String[] args) {
		RBI ref=null; 
	 String name= bankName();
	if(name.equals("SBI")) 
	{
		ref= new SBI();
	
	} else if(name.equals("HDFC")) 
	{
	
		ref=new HDFC();
		}
		else if(name.equals("city"))
		{
			ref=new CITY();
			
		}
		
		ref.creditCard();
		ref.currentAcc();
		ref.debitCard();
		ref.savingAcc();
}
	public static String bankName()
	{
		return "SBI";
	}

}
