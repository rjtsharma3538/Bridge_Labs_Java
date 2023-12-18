import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        double delta=b*b-4*a*c;
        delta=Math.sqrt(delta);

        double x1,x2;

        x1=(-b+delta)/(2.0*a);
        x2=(-b-delta)/(2.0*a);
        
        System.out.println(x1+" "+x2);
    }
}
