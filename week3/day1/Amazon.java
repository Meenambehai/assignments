package week3.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cashOnDelivery() {
		System.out.println("The opted method is cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("The opted method is UPI");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("The opted method is card payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("The opted methos is internet banking");
		
	}
	
	public static void main(String[] args) {
		Amazon pay = new Amazon();
		pay.cardPayments(); 
		pay.cashOnDelivery();
		pay.internetBanking();
		pay.upiPayments();
		pay.recordPaymentdetails();
	
		
	}

}
