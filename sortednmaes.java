import java.util.Scanner;

public class sortednmaes {
public static void main(String[] args) {
    int n,i,j;
    String temp;

    Scanner s = new Scanner(System.in);
    System.out.println("Enter no of elements");
     n = s.nextInt();
String names[] = new String[n];
Scanner s1 = new Scanner(System.in);
System.out.println("enter the elements :");
for(i=0; i<n;i++){
    names[i] = s1.next();
}
for(i=0;i<n;i++){
    for(j=i + 1; j<n;j++)
    {
        if(names[i].compareTo(names[j])>0){
temp = names[i];
names[i] = names[j];
names[j] = temp;
        }
    }
}

System.out.println("Sorted values :");



 for(i=0; i<n;i++){
System.out.println(names[i]);
 }   
}
}