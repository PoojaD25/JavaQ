public class RemoveSymbol {
    public static void main(String[] args) {
        String s="Raj @#$%Pooja& 458java*++@React";
        String s1="Raj @#$%Pooja12@React";
        String s2="PHP @#$%Java @React";

        //  Regular exp: [^a-zA-Z]: keep regular value and remove others. Replace with blank or some other string or character

     s=s.replaceAll("[^a-zA-Z0-9 ]", "");
     s1=s1.replaceAll("[^a-zA-Z0-9 ]", "Sun");
     s2=s2.replaceAll("[^a-zA-Z0-9 ]", "A");


     /*
     since s is string and string is immutable we can use replace() , but not reverse() as it changes the original value
     in heap so it is not allowed.
      */
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
