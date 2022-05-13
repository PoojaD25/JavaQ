//Reverse the string= Ritvik Dhanjani
public class ReverseString {


    public static void main(String[] args) {
        String s="Ritvik Dhanjani";
        System.out.println(s);
        String r="";
//1st way
      char ch[]= s.toCharArray();
        for(int i=s.length()-1; i>=0;i-- ) {

            r=r+s.charAt(i);
        }
        System.out.println(r);

   //2nd way
        for(int i=s.length()-1; i>=0;i-- ) {
            r = r + ch[i];}
            System.out.println(r);

        //3rd way
        StringBuffer sb= new StringBuffer(s);
        System.out.println( sb.reverse());
    }
    }


