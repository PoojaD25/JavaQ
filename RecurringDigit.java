package JavaQues;

import java.util.Scanner;

public class RecurringDigit {
	
	
	
	/*
	public void div(int x) {
		int q=x/10;
		System.out.println(q);
		x=q;
		q=x/10;
		System.out.println(q);
		
	}*/

	
	public int RecurringDigi(int x, int d){
		
		if(x<0)
			System.out.println(x +": is negative no. not allowed");
		
		int i=0;
		while(x/10!=0) {
		
		int r=x%10; 
		int q=x/10;
		x=q;
		 
		
		if(r==d)
			i++;
		}
		
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println("enter digit to check number of times it appears ");
		int y= sc.nextInt();
	
		
		RecurringDigit r= new RecurringDigit();
		
		System.out.print(r.RecurringDigi(n, y));

		

}}
