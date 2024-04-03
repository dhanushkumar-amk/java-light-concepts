import java.util.Scanner;

/**
 * palindrome
 */
public class palindrome {

    static void CheckPalindrome(String input){
        boolean result = true;
        int length = input.length();
for(int i=0; i<length/2; i++){
    if(input.charAt(i) != input.charAt(length -1-i)){
        result = false;
        break;
    }
}
System.out.println(input + " Palindrome = "  + result);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the statement :");
        String str = s.nextLine();
        CheckPalindrome(str);
   
    }
}