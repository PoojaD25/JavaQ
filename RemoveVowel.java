public class RemoveVowel {

    // remove vowel from string
    public static void main(String[] args) {
        String s="Mohit Das";
        char ch[]=s.toCharArray();
        char x;
        for(int t=0; t<s.length(); t++)
        {

            char c=s.charAt(t);
            if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))
            {
                System.out.print(c);
            }

        }

    }
}
