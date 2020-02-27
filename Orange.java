import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orange {
    public static void main(String[] args) {
        int n, m, s, t, a, b, appsum, orrsum, apples = 0, oranges = 0;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        t = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();
        int apple[] = new int[m];
        int orange[] = new int[n];
        List<Integer> app = new ArrayList<Integer>();
        List<Integer> orr = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            apple[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            orange[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            appsum = a + apple[i];
            app.add(appsum);
        }
        for (int i = 0; i < n; i++) {
            orrsum = b + orange[i];
            orr.add(orrsum);
        }
        for (int c : app) {
            if (c >= s && c <= t) {
                apples++;
            }
        }
            for (int d : orr) {
                if (d >= s && d <= t) {
                    oranges++;
                }
            }
        System.out.println(apples);
        System.out.println(oranges);


        }
    }

