import java.util.Scanner;

public class palindromofstring 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		StringBuilder s =new StringBuilder(sc.next());
		if(s.toString().equals(s.reverse().toString()))
		  {
			System.out.println("the etered string is pallindrom");
			}
		  
		  else
		  {
			System.out.println("not a pallindrom");
		}
	

	}

}
