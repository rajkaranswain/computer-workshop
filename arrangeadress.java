import java.util.Scanner;

public class splittheadress {

	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner(System.in);
		String input = sc.nextLine();
		String arr[]=input.split(":");
		for( i=0;i<arr.length;i++ )
		{
			System.out.println(arr[i]);
		}

	}

}
