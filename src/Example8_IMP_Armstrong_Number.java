

public class Example8_IMP_Armstrong_Number 
{
	public static void main(String[] args) 
	{
		int num=153;
		int sum=0;
		
		for(int i=num; i>0;  i=i/10) // 153/10=15 15/10=1 1/10=0
		{
			int rev=i%10; //1&10=1
			sum=sum+(rev*rev*rev); //27+125+1			
		}
		
		if (num==sum)
		{
			System.out.println("giver number "+num+" is an armstrong number");
			
		} 
		else
		{
			System.out.println("given number "+num+" is not an armstrong number");

		}
		
	}

}
