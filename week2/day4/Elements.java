package week2.day4;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements ele = new Elements();
		System.out.println("Trying to access webelement class method - click, settext");
		ele.click();
		ele.setText("Welcome");
		System.out.println("Trying to access button class method");
		ele.submit();
		

	}

}
