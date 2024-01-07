package JavaQues;

import java.util.Scanner;

public class VowelConsonant {
	
	public void countOfVowelConsonant(String a)
	{
		int x=0;
		int y=0;
		for(int i=0; i<a.length();i++)
		{
			char c=a.charAt(i);
			
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			{
				x++;
			}
		
			else{
				y++;
			}
		
		}
		
		System.out.println("no. of vowel: " +x);
		System.out.println("no. of consonant: " +y);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter aplhanumeric string with symbols");
		 String s=sc.next();
		 s=s.replaceAll("[^a-z]", "");
		 System.out.println("filtered string: " + s);
		 
		 VowelConsonant v= new VowelConsonant();
		 v.countOfVowelConsonant(s);
		 
		 
		 
		 
		
	}

}
