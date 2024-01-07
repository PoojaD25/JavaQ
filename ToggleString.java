package JavaQues;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {
		// concept Ascii a-32=A and a=A+32 therefore convert a to A and A to a
		
		String s1="";

		String s="";
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string to toggle");
		s=sc.next();
		for(int i=0; i<s.length();i++) {
					char c=s.charAt(i);
		
		if(c>='A'&& c<='Z') {
		char c1=(char) (c+32);
		s1=s1+Character.toString(c1);
		}
		if(c>='a'&& c<='z') {
			char c2=(char) (c-32);
			s1=s1+Character.toString(c2);
	}
		
		}
		System.out.print("result : "+s1);
}}
