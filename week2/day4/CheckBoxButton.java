package week2.day4;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		// TODO Auto-generated method stub
		System.out.println("click checkbox button method from checkbox button class executed");

	}

	public static void main(String[] args) {
		CheckBoxButton chk = new CheckBoxButton();
		chk.submit();
		chk.clickCheckButton();
	}
}
