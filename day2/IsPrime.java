package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		int num =31;
		 int count =0;
		for(int i=2;i<=num-1; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count ==0)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " in not a prime number");
		}
	}
		
}
