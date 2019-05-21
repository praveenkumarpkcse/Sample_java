import java.io.*;
import java.util.*;
public class space
{
	public static void main(String[] args) {
		String word;
		char s1=' ';
		int count=0;
		Scanner s=new Scanner(System.in);
		word=s.nextLine();
		char a[]=word.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]==s1)
		  {
		      count++;
		  }
        }
        System.out.print(count);
	}

	
}
