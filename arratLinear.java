
import java.util.Scanner;
/**
 * arratLinear
 */
public class arratLinear {
public static void main(String[] args) {
    int num, count,i;
    int input[] = new int[100];
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number of elements you want enter");
    count = s.nextInt();
    System.out.println("Enter " + count + " Elements");
for(i = 0; i < count; i++){
input[i] = s.nextInt();
}
System.out.println("enter the element to search");
num = s.nextInt();
for(i =0; i < count ; i++){
    if(num == input[i]){
        System.out.println("Is present");
        break;
    }
}
if(i ==count){
    System.out.println("not present");
}
    

}
    
}