public class PalindromeNo {
   /* public static boolean isPallindrome(int num) {
        System.out.println("given no. : " + num);
        int r;
        int sum = 0;
        int x = num;
        while (num > 0) {
            r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;

            if (x == sum) {
                return true;
            }
        }
        return false;

    }
*/

    public static void main(String[] args) {
      /*  System.out.println( isPallindrome(451));
        System.out.println( isPallindrome(15451));*/

        int a[]={1,2,3,4,1};
        int N=a.length;
        int evenIndex=0;
        int oddIndex=0;
        int absoluteDifference;
        System.out.println(N);
        for(int s:a)

{
    System.out.print(s);
    System.out.print(" ");

}
        for (int i = 0; i < N; i++) {
            if(i%2==0) {
                evenIndex = evenIndex + a[i];
            }

            else
            { oddIndex=oddIndex+a[i];}

        }
        System.out.println();
        int diff=evenIndex-oddIndex;
        absoluteDifference=Math.abs(diff);
        System.out.println(absoluteDifference);
    }
}