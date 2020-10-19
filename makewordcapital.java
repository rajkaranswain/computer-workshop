import java.util.Scanner;

public class wordcapital {

	public static void main(String[] args) 
	{
		int i;
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine();
		String arr[]=input.split(" ");
		String result="";
		for(i=0;i<arr.length;i++)
		{
			String s= arr[i].substring(0,1);
			s=s.toUpperCase();
			s=s+arr[i].substring(1);
			result=result+s+" ";
			
		}
		System.out.println(result);


	}

}
