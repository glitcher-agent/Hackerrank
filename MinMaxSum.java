import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.Scanner;

public class MinMaxSum {
    public static void main(String args[]) {
        int arr[] = new int[5];
        int sum = 0,two=0,three=0,four=0,five=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++) {
            arr[i] = sc.nextInt();
            if (i != 0) {
                sum = sum + arr[i];
            }
            if (i != 1) {
                two = two + arr[i];
            }
                if (i != 2) {
                    three = three + arr[i];
                }
                    if (i != 3) {
                        four = four + arr[i];
                    }
                        if (i != 4) {
                            five = five + arr[i];
                        }
                    }
                    System.out.println(sum + " "+two+" "+three+" "+four+" "+five);
        int ar[]={sum,two,three,four,five};
        int large=ar[0];
        int small=ar[0];
        for (int i=0;i<5;i++){
            if (ar[i]>large)
            {
                large=ar[i];
            }
            if (ar[i]<small)
                small=ar[i];

        }
        System.out.println(large+" "+small);
     }
}