import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        int tmp=b;
        b=a;
        a=tmp;

        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);
    }
}
