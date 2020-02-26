import java.util.Scanner;
import java.math.*;

public class JavaLoopsII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q, n = 0, a = 0, b = 0;
        q = sc.nextInt();
        int g=q;
        while (g > 0) {
                a = sc.nextInt();
                b = sc.nextInt();
                n = sc.nextInt();
            int sum = a;
            for (int i = 0; i < n; i++) {
                sum = (int) (sum + (Math.pow(2, i)) * b);
                System.out.print(sum + " ");
            }
            g--;
        }
    }
}