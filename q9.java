import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.next().charAt(1);

        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            System.out.println("vowel");
        else 
            System.out.println("consonant");
    }
}
