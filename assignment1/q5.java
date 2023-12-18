import java.util.*;

class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        for (int i = 2; i * i <= tmp; i++) {
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;
                System.out.print(i + " ");
            }
            if (n == 1)
                break;
        }
    }
}