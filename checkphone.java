import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkphone {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the phone no.");
		String tele = s.nextLine();
		String reg = "(0|(91))?[7-9][0-9]{9}";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(tele);
		if(m.find())
		{
			System.out.println(tele+"it is exist");
		}
		else
		{
			System.out.println(tele+"it is not exist");
		}

	
	}

}
