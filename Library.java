package week1.day3;

public class Library {
	
	public static void main(String[] args) {
		  Library lib= new Library();
		  String display;
		  display = lib.addBook("You can win");
		  System.out.println("The name of the added book is " +display);
		  lib.issueBook();
		  
	}

	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");
		
	}

	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
		System.out.println("Book added succesfully");
		return bookTitle;
		
	}

}
