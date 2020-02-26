import java.sql.SQLOutput;
import java.util.Scanner;

public class PairShocks {
    public static void main(String[] args) {
        int hg=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }

        }
        System.out.println(count);
    }
}
