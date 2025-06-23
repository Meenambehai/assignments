package week2.day4;

public class LoginTestData extends TestData{
	
	private void enterUsername() {
		// TODO Auto-generated method stub
		System.out.println("Enter Username");
	}
	private void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter password");
	}
	public static void main(String[] args) {
		 LoginTestData login = new LoginTestData();
		 login.enterCredentials();
		 login.enterUsername();
		 login.enterPassword();
		 login.naviagteToHomepage();
		 
	}

}
