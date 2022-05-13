public class TestCountChar {
    public static void main(String[] args) {
        String s = "I am in love with him";
    getCount("I am in love with him", 'm');
    getCount("I am in love with him", 'i');
    getCount("I am in love with him", 'h');
    getCount("I am in love with him", 'a');

    }


        public static void getCount(String str, char value)
        {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == value)
            {
                count++;
            }
        }
        System.out.println(value+ ": " + count);

    }
}
