import java.util.Scanner;

public class NumericalQuestion {
    int a= 45;
    int b=32;
//1. method with return type and pre assigned data
    int Difference()
    {
       int  x=this.a;
        int y=this.b;

        int difference=x-y;
return difference;
    }

    // 2. static method with void return type and post assigned data
    public static void Mutilply(int x, int y)
    {
        int mul= x*y;
        System.out.println("Multiply is "+ mul);
    }

public int Sum(int x, int y,int z)
{
    int sum=x+y+z;
    return sum;
}

    public static void main(String[] args) {

        // 3rd way taking input from user

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a and b as operator");
        int a= sc.nextInt();

        int b=sc.nextInt();

        int difference= a-b;
        System.out.println("difference =" + difference);

        int multiple= a*b;
        System.out.println("multiple is "  + multiple);

        NumericalQuestion n=new NumericalQuestion();
        System.out.println( n.Difference());

      int Sum=  n.Sum(2, 4, 5);
        System.out.println("sum of 2,4,5= " + Sum);

NumericalQuestion.Mutilply(45, 32);


    }
}
