import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class dictinary {

	public static void main(String[] args) 
	{
		LinkedList<LinkedList<String>> dict = new LinkedList<LinkedList<String>>();
		for(int i=0;i<26;i++)
		{
			LinkedList<String> l =new LinkedList<String>();
			dict.add(i,l);
		}
		int n=1;
		Scanner sc = new Scanner (System.in);
		while(n==1)
		{
			String s = sc.next();
			char a = s.toLowerCase().charAt(0);
			int index = a-'a';
			dict.get(index).add(s);
			System.out.println("enetr 1 to enter more or 0 to end");
			n=sc.nextInt();
		}
	
	
		for(LinkedList<String> r : dict)
		{
			if(!r.isEmpty())
			{
			Collections.sort(r);
			for(String s:r)
			{
				System.out.print(s+"\t");
			}
			System.out.println();
			}
		}
	}

}
