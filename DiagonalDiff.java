import java.util.Scanner;
import java.math.*;

public class DiagonalDiff {
    public static void main(String args[]){
        int sum=0,sum1=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat1[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                mat1[i][j]=sc.nextInt();

            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if(i==j) {
                    sum = sum + mat1[i][j];
                }
                if(i==n-j-1){
                    sum1=sum1+mat1[i][j];
                }
            }

        }

        int diff= Math.abs( sum-sum1);
        System.out.println(diff);


    }
}
