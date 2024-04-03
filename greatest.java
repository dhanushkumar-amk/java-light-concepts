import java.util.Scanner;

/**
 * greatest
 */
public class greatest {

    public static void main(String[] args) {
        int a ,b,c;
        Scanner s = new Scanner(System.in);
    System.out.println(" A");
    a= s.nextInt();
    System.out.println(" B");
    b= s.nextInt();
    System.out.println(" C");
    c= s.nextInt();


    if( a > b && a > c){
        System.out.println("a");
    }
    else if(b > c){
        System.out.println("B");
    }
    else{
        System.out.println("c");
    }
    }
}