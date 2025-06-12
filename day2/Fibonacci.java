package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int firstnum=0;
		int secnum=1;
		int temp=0;
		for (int i=0;i<num;i++)
		{
		 System.out.print(firstnum + " ");
		  temp = firstnum+secnum;
		  firstnum=secnum;
		  secnum=temp;
		}
	}

}
