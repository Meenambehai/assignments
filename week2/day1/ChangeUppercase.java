package week2.day1;

import java.util.Arrays;

public class ChangeUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="changeme";
		char[] charArray = s1.toCharArray();
		System.out.println(charArray.length);
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
		}
		System.out.println(charArray);
		

	}

}
