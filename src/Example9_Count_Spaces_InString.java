

public class Example9_Count_Spaces_InString 
{
	public static void main(String[] args) 
	{
		String str="a v s g s";
		int count=0;
		
		for (int i = 0; i < str.length()-1; i++) 
		{
			char str1 = str.charAt(i);	
			if (str1 == ' ')
			{
				count++;
			}	
		}
		System.out.println("No of spaces in given string is "+count);				
	}

}
