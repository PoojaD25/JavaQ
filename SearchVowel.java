import java.util.Scanner;

public class SearchVowel {

    //search vowel in string

    public static void searchVowel(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println("Vowel in current string is " +c);
            }
        }
    }

    public static void main(String[] args) {

        searchVowel("pooja");
    }

}
