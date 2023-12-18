import java.util.*;

class q6{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        int q=a/b;
        int rem=a%b;

        System.out.println(q);
        System.out.println(rem);
    }
}