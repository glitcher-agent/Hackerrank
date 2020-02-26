import java.util.*;


public class StrPermut{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        List<Character> see=new ArrayList<Character>();
        for (int i=0;i<s.length();i++){
           see.add( s.charAt(i));
        }
        System.out.println(see);
        String v="";

        for (int i=0;i<s.length();i++)
        {
            v=v+ see.get(i);
        }
        for (int i=0 ;i<s.length();i++)
        {
            char temp=see.get(i);
           char x=see.get(i+1);
           String f=temp+v;

        }
        System.out.println(v);

    }
}