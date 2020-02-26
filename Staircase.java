import java.util.*;
public class Staircase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n-1;i++)
        {
            System.out.print(" ");

            for (int j=0;j<(n-i);j++){
                    System.out.print("# ");

            }
            System.out.println();
        }

    }

}
