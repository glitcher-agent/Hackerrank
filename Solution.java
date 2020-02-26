import java.util.*;
public class Solution{
    public static void main(String args[]){
        int n,alice=0,bob=0;
        List<Integer> mylist=new ArrayList<Integer>();
        List<Integer>mylist2=new ArrayList<Integer>();

        Scanner sc =new Scanner(System.in);
        for (int i=0;i<3;i++){
            mylist.add(sc.nextInt());
        }
        for (int i=0;i<3;i++){
            mylist2.add(sc.nextInt());
        }
        for (int i=0;i<3;i++){
           if (mylist.get(i) > mylist2.get(i))
           {
               alice++;
           }
           else
           {
               bob++;
           }
        }
        System.out.println(bob);
        System.out.println(alice);

    }
}
