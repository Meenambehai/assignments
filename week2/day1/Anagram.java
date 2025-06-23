package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="stops";
		String s2="potss";
		int s1len =s1.length();
		int s2len =s2.length();
		if(s1len==s2len)
		{
			System.out.println("String are of equal length");
		}
		else
		{
			System.out.println("Strings are of different length");
		}
		char[] charArray = s1.toCharArray();
		System.out.println(charArray);
		
		char[] charArray2 = s2.toCharArray();
		System.out.println(charArray2);
		Arrays.sort(charArray);
		for(int i=0;i<charArray.length;i++)
		{
		System.out.print(charArray[i]);
		}
		System.out.println("");
		Arrays.sort(charArray2);
		for(int j=0;j<charArray2.length;j++)
		{
			System.out.print(charArray2[j]);
		}
		System.out.println("");
		/*for(int i=0;i<charArray.length;i++)
		{
			for(int j=0;i<charArray2.length;j++)
			{
				if(charArray[i]==charArray2[j])
				{
					System.out.println("Match found");
				}
				else
					
				{
					System.out.println("Not matched");
				}
			}
		}*/
		if(Arrays.equals(charArray, charArray2))
		{
			System.out.println("Match");
		}
		else
		{
			System.out.println("No match");
		}
		
			

	}

}
