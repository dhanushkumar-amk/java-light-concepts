
import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
        int n;
        string temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value to enter :");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the value :");
        for(int i =0; i< n; i++){
            names[i] = s1.next();
        }
        for(int i =0; i<n;i++){
            for(int j = i + 1; j<n;j++){
                if(names[i].compareTo(names[j])>0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;

                }
            }
        }
        System.out.println("Sorted names");
        {
            for(int i=0; i<n;i++){
System.out.println(names[i]);
            }
        }
    
    }
    
}
