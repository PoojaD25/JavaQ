public class WordInterchange {

    //reverse string without interchanging word position

    public static void main(String[] args) {
        String s= "Raj is Indian";
        System.out.println(s);
        System.out.println("After interchange");

        for (String temp:s.split(" "))
        {

            String r=" ";
            for(int i=temp.length()-1; i>=0; i--)
            {
                char c[]=temp.toCharArray();
                r=r+c[i];

            }
            System.out.print(r);
        }
    }
}
