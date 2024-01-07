package JavaQues;

public class CountDigits {

	  public int CountDigit(int x)
	  {
		  if(x==0)
		   return 1;
		  
		   if(x<0)
			  x=-x;
		  			  
		  int i=1;
		  
		  while(x/10>0)
		  {	  
		 int r=x/10;
		 x=r;
		 i++;
		 }
		  
		return i;
		 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigits c= new CountDigits();
				System.out.println(c.CountDigit(55658));
	System.out.println(	c.CountDigit(558));
		
System.out.println( c.CountDigit(0));
System.out.println(  c.CountDigit(-571558));
		
	}

}
