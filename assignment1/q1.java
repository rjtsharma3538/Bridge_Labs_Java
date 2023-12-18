
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int head = 0, tail = 0;

        for (int i = 0; i < n; i++) {
            double num = Math.random();
            System.out.println("i is: " + i + " num is: " + num);

            if (num < 0.5)
                tail++;
            else
                head++;
        }

        double percentHead = (head / (double) n) * 100;
        double percentTail = 100 - percentHead;

        System.out.println("Percentage of head outcomes is: " + percentHead);
        System.out.println("Percentage of tail outcomes is: " + percentTail);
    }
}