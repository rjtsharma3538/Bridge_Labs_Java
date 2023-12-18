import java.util.*;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double v,t;
        v=sc.nextDouble();
        t=sc.nextDouble();

        double tmp=Math.pow(v,0.16);
        double ans=(0.4275*t-35.75)*tmp;
        ans+=35.74+0.6215*t;

        System.out.println(ans);
    }
}
