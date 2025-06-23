package week2.day4;

public class Edge extends Browser {
	
	public void takeSnap() {
		// TODO Auto-generated method stub
		
		System.out.println("Take snap done");

	}
	public void clearCookies() {
		// TODO Auto-generated method stub
		System.out.println("cookies cleared");

	}
	public static void main(String[] args) {
		 Edge ed = new Edge();
		 ed.browserName="Edge";
		 System.out.println(ed.browserName +" browser opened successfully");
		 ed.opneURL();
		 ed.navigateBack();
		 ed.takeSnap();
		 ed.clearCookies();
		 ed.closeBrowser();
	}

}
