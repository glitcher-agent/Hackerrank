import java.util.*;

public class Grading {
   static double round(int x) {
        if (x % 5 == 0) {
            return (Math.floor(x / 5)) * 5;
        } else {
            return ((Math.floor(x / 5)) * 5) + 5;
        }
    }

    public static void main(String[] args) {
        int n,m,k;
        Scanner sc=new Scanner(System.in);
        List<Integer> ls=new ArrayList<Integer>();
        List<Integer> ms=new ArrayList<Integer>();
        n=sc.nextInt();
        for (int i=0;i<n;i++){
            ls.add(sc.nextInt());
        }
        for (int i=0;i<n;i++) {
            m = ls.get(i);
           k= (int) round(m);

           if (m>=38&&(k-m)<3)
           {
               ms.add(k);

           }
           else
           {
               ms.add(m);
           }
        }
        for (int i=0;i<n;i++){
            int j=ms.get(i);
            System.out.println(j);

        }

    }
}