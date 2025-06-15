package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numb=12321;
		int num=numb;
		int r,output=0;
		System.out.println("Program to check palindrome");
	
		  while (num>0)
		  {
			  r=num%10;
			  output=output*10+r;
			  num=num/10;
		  }
		  System.out.println("Reversed number " +output);
		  System.out.println("Original number : " +numb);
		  
		  if (numb == output)
		  {
			  System.out.println("Yes!! It's a palindrome");
		  }
		  else
		  {
			  System.out.println("Not a palindrome");
		  }
	}

}
