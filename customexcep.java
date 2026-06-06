package training2;
class insufficient extends Exception{
	public insufficient(String msg) {
		super(msg);
	}
}
public class customexcep {
    double balance = 5000;
    void withdraw(double amount) throws insufficient {
    	if(balance<amount) {
    		throw new insufficient("Insufficient balance");
    	}
    	balance = balance - amount;
    	System.out.println("Withdraw successfully");
    }
	public static void main(String[] args){
		customexcep cs = new customexcep();
		try {
			cs.withdraw(7000);
		}
		catch(insufficient e) {
			System.out.println(e.getMessage());
		}
		

	}

}
