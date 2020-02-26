import java.util.*;

public class Minus {
    public static void main(String args[]){
        int a = 0,b=0,c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                a++;
            }
            else if(arr[i]==0)
            {
                b++;

            }
            else
            {
                c++;
            }

        }
        System.out.println(a / n);
        System.out.println(b / n);
        System.out.println(c / n);
    }
}
