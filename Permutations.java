import java.util.Scanner;
import java.lang.*;

public class Permutations {
    static void rev(String s){
        StringBuffer str=new StringBuffer(s);
        System.out.println(str.reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char temp;
        int inx = 0;
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        while (inx < str.length) {
            for (int i = 0; i < str.length - 1; i++) {
                temp = str[i];
                str[i] = str[i + 1];
                str[i + 1] = temp;

            }
            System.out.println(str);

            String word="";
            word=word+str;
            rev(word);
            inx++;
        }
    }


}
