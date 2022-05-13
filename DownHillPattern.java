public class DownHillPattern {

    public static void main(String[] args) {
        int n = 5;

       for (int r = 1; r <= n; r++) {
            int totalColInRow =  n - r + 1;
            int spaces = n - totalColInRow;
            for (int s = 0; s <=spaces; s++)
                System.out.print(" ");

            for (int c = 1; c<=totalColInRow; c++) {
                System.out.print(" *");
            }

            System.out.println();


        }
    }
}


