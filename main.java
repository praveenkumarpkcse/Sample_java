import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	String word;
		int count=0;
		char b=' ';
		char c='.';
		Scanner s=new Scanner(System.in);
		word=s.nextLine();
		char a[]=word.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
		  if(((a[i]>='a'&& a[i]<='z')||(a[i]>='A'&& a[i]<='Z') ||(a[i]==b) ||(a[i]==c)))
		  {
		     a[i]=0;
		  }
		  else
		  {
		  count++;    
		  }
        }
        System.out.print(count);
	}
}
