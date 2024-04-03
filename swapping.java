import java.util.Scanner;

/**
 * swapping
 */
public class swapping {

    public static void main(String[] args) {
        int m,n;
        Scanner s = new Scanner(System.in);
        System.out.println("M :");
        m = s.nextInt();
        System.out.println("N :");
        n = s.nextInt();

        m = m + n;
        n = m - n;
        m = m - n;


        System.out.println(m);
        System.out.println(n);
    }
}