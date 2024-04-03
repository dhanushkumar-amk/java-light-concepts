import java.util.Scanner;

/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        int num, factorial;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value :");
        num = s.nextInt();
        factorial =  fact(num);
        System.out.println(factorial);
    }
static int fact(int n){
    int output;
    if(n == 1){
        return 1;
    }
    output = fact(n-1)*n;
    return output;
}

}