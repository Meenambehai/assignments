package week2.day1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="TestLeaf";
		char[] charArray = companyName.toCharArray();
		System.out.println(charArray);
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}

	}

}
