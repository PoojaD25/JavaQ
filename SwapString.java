public class SwapString {
    public static void main(String[] args) {


        String a = "Swachcha";
        String b = "Bharat";
        a=a+b;
        System.out.println(a);
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
