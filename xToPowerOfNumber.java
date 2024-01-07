package JavaQues;

import java.util.Scanner;

public class xToPowerOfNumber {
	
	public int powerOfNum(int x, int n)
	{ 
	
	 if (n==0)
         return 1;
	 
		 return x*powerOfNum(x,n-1);
		  
	}
	
	public static int power(int x, int n) {
		if(n==0)
			return 1;
		if(n%2==0)
		{
			int mul=power(x,n/2)*power(x,n/2);
			return mul;
		}
		
		return x*power(x,n/2)*power(x,n/2);
	}
	
	public void pow(int x, int n) {
		int a=1;
		
		if(n==0);
		System.out.println(1);
		
		for(int i=1; i<=n; i++)
		{
	
			 a=a*x;
		}
		
		System.out.println("x to the power of n:"+a);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		xToPowerOfNumber p= new xToPowerOfNumber();
  p.pow(10, 3);

System.out.println(p.powerOfNum(3, 4));
System.out.println(p.powerOfNum(2, 1));
//System.out.println(p.powerOfNum(5, -3));
System.out.println(p.powerOfNum(8, 0));
System.out.println(p.power(4, 4));
System.out.println(p.power(5, 0));
System.out.println(p.power(7, 3));
	}

}
