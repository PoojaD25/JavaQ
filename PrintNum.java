import java.util.stream.IntStream;

public class PrintNum {

    // Print number without using for/while/do-while

    //1st using recurrssion


    public static void printNum(int Startnum, int endnum)
    {
        if(Startnum<=endnum )
            System.out.println( Startnum);
        Startnum++;
        printNum(Startnum, endnum);
    }

    public static void main(String[] args) {
        printNum(1, 101);

       // IntStream.range(1,101).forEach(value -> System.out.println(value));

    }
}
