import java.util.*;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / (double) i;
        }

        System.out.println(sum);
    }
}