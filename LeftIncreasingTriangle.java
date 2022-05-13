public class LeftIncreasingTriangle {
    public static void main(String[] args) {
        for (int r=1;r<=5;r++)
        {
            for(int s=r;s<5;s++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++)
                System.out.print("+" );
            System.out.println();
        }
    }

}

