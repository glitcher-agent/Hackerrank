import java.util.*;

public class UniqueStr {
    public static void main(String[] args) {
        String s;
        List<String> ll = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String[] sd = s.split("\\s");
        for ( String w : sd) {

            ll.add(w);
        }
        Set<String> srf=new HashSet<String>(ll);
        for (String d: srf){
            System.out.println(d);
        }

    }

}
