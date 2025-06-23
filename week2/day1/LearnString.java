package week2.day1;

public class LearnString {
	public static void main(String[] args) {
		
	
	String name1="Meena";
	String name2="Meena";
	if (name1==name2)
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("different");
	}
	
	String sentence ="My name is Meenambehai";
	//String[] split =sentence.split("name", 10);
	String[] split = sentence.split("n", 1);
	for(int i=0;i<split.length;i++)
	{
	System.out.println(split[i]);
	
	}
	}
}
