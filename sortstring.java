import java.util.Scanner;

public class sortstring {

	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr the the no of input string");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(i=0;i<n;i++)
		{
			System.out.println("enter the string");
			str[i]=sc.next();
		}
			String temp;
			for (int j = 0; j < str.length; j++) 
			{
			   	   for (i = j + 1; i < str.length; i++) 
			   	   {
			   		// comparing adjacent strings
			   		   if (str[i].compareToIgnoreCase(str[j]) < 0) 
			   		   	{
			   			   temp = str[j];
			   			   str[j] = str[i];
			   			   str[i] = temp;
			   		    }
			   	    }
			 } 
			System.out.println("sorted items are");
			for(String item : str )
			{
				System.out.println(item);
			}
			
			   	   

	}
}
