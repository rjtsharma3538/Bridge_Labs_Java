import java.util.*;

public class ques3 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();

        double dist=x*x+y*y;

        double ans=Math.sqrt(dist);

        System.out.println(ans);
    }
}
