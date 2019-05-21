import java.io.*;
import java.util.*;
public class count_char
{
	public static void main(String[] args) {
		String word;
		Scanner s=new Scanner(System.in);
		word=s.nextLine();
		String s1=word.replaceAll(" ","");
		int l=s1.length();
		System.out.print(l);
	}
}
