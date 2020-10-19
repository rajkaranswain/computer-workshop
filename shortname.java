import java.util.Scanner;

public class shortname {

	public static void main(String[] args) {
		int i;
		String result=""; 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String input = sc.nextLine();
		String arr[]=input.split(" ");
		//names
		for(i=0;i<arr.length-1;i++)
		{
			String s= arr[i].substring(0,1);
			s=s.toUpperCase();
		    result = result+s+".";
			
		}
		//surname or 1 word
		String a= arr[arr.length-1].substring(0,1);
		a=a.toUpperCase();
		a=a+arr[i].substring(1);
		System.out.println(result+a);
		

	}

}
