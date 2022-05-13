public class WithoutSymbolReverse {

    //Reverse String without Affecting Symbol position

    public static void reverse(String x)
    {
        x=x.replaceAll("[^a-zA-z]","");
        System.out.println(x);
        String rev="";
        for(int i=x.length()-1;i>=0;i--)
        {
            rev= rev+ x.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        String s = "Raj3@is an$INDIAN#";
        int r = s.length() - 1;
        System.out.println(r);
        int l = 0;
        char c[] = s.toCharArray();
        char firstC = s.charAt(l);
        System.out.println(firstC);
        char lastC = s.charAt(r);
        System.out.println(lastC);
try{
        for (int i = r; i >= 0; i--) {

            if (!(Character.isAlphabetic(lastC) && Character.isDigit(lastC))) {
                r--;
            } else {
                int t = 0;
                c[t] = c[r];
                c[r] = c[l];
                c[l] = c[t];
                l++;
                r--;
            }

        }
        }
        catch(IndexOutOfBoundsException e)
    {

        System.out.print(c[r]);

    }
reverse("Raj3@is an$INDIAN#");

        }
    }



