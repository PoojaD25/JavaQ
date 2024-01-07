package JavaQues;

public class OddEven {
	
	
	public String checkEvenOdd(int x)
	{
		
			
	
		int q=x/2;
		String s;
	
		if(q*2==x) 
		
		 s="even";
		else 
			s="odd";
		
			return s;
	
	}
	
	public String isEvenOdd(int x)
	{
	String s;
		if(x%2==0) 
		
		 s="even";
		else 
			s="odd";
		
			return s;
	
	}
	
	public String bitwiseEvenOdd(int x)
	{
	String s;
		if((x&1)==0) 
		
		 s="even";
		else 
			s="odd";
		
			return s;
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	OddEven e= new OddEven();
	System.out.println(e.checkEvenOdd(20));
	System.out.println(e.checkEvenOdd(21));
	System.out.println(e.isEvenOdd(55));

	System.out.println(e.isEvenOdd(58));
	System.out.println(e.bitwiseEvenOdd(58));
	System.out.println(e.bitwiseEvenOdd(59));
	
}

}
