import java.lang.reflect.Array;
import java.util.*;
public class Bigsum {
    public static void main(String args[]) {
        long sum=0;
        int arr[] = new int[10];
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}