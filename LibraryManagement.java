package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library libm = new Library();
		String book1 = libm.addBook("Encyclopedia");
		System.out.println("The added book is " +book1);
		libm.issueBook();

	}

}
