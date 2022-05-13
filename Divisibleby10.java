import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisibleby10 {
    public static void main(String[] args) throws IOException {

        boolean divisibleBy10=false;
        String ar1[]= new String[5];
        String ar2[]= new String[5];

        int count =0;

        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number to find divisible by 10");

        for(int i=0; i<ar1.length; i++)
        {
            ar1[i]=b.readLine();
        }

        for(int i=0; i<ar1.length; i++)
        {
            if( Integer.parseInt(ar1[i]) %10 == 0 )
            {
                ar2[count]=ar1[i];
                count=count+1;
            }
            else
            {
                System.out.println("not divisible by 10");
            }
        }
    }
}
