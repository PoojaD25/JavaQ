public class ReverseNumber {
    public static void main(String []args)
    {
        long num=45288;
        long rev=0;
//1st way
        while(num!=0)
        {
            rev= rev*10 + num% 10;
            num=num/10;
        }
        System.out.println(rev);


long num1=7531;
        StringBuffer sb=new StringBuffer(String.valueOf(num1));
        System.out.println(sb.reverse());
    }
}
