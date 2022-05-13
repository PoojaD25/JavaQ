import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List list1=new ArrayList(Arrays.asList("Amazon","Google","Walmart","Amazon","GoldmanSachs"));
        List list2=new ArrayList();
        list2.add("Google");
        list2.add("MicroSoft");
        list2.add("Boeing");
        list2.add("MicroSoft");

        ArrayList list3=new ArrayList(Arrays.asList("Amdocs", "HP","Walmart","Informatica"));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // return unique element from List

        System.out.println("Unique elements from list");
        LinkedHashSet hs=new LinkedHashSet(list1);
        ArrayList uniqueList= new ArrayList(hs);
        System.out.println(uniqueList);

        //compare lists

        list1.removeAll(list2);
        System.out.println("Remove common elememnt list2 from list1" + list1);

        list1.retainAll(list3);
        System.out.println(" common element:" + list1);










    }
}
