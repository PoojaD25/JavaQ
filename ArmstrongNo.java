public class ArmstrongNo {

    //153= 1^3+ 5^3 +3^3

    public static void isARMSTRONG(int num)
    {

        System.out.println("Number is:" + num);
        int cube=0;
        int r;
        int t=num;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            cube = cube + (r * r * r);
        }

            if (t == cube)
            {
                System.out.println("Armstrong number");
            }
            else
            {
                System.out.println("Not Armstrong number");
            }

    }

    public static void main(String[] args) {
isARMSTRONG(153 );
isARMSTRONG(454);
    }
}
