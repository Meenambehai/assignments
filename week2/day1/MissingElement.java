package week2.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {1,4,3,2,8,6,7};
		/*  int temp=a[0];
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]>a[j])//4>3
				  {
					  temp=a[i];//4
					   a[i]=a[j];//3
					  a[j]=temp;//4
				  }
			  }
			  
			  System.out.println(a[i]);
			  
			  
		  }*/
		 Arrays.sort(a);
		 for(int i=1;i<a.length;i++)
		 {
			 System.out.print(a[i]+ " ");
		 }
		 System.out.println("To find the missing number");
		
		for (int i = 1; i < a.length; i++) {
			int num = a[i - 1];

			if (num != i) {
				System.out.println("Missing number = " + i);
				break;
			}
		}
	}

}
