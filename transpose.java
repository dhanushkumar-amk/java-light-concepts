import java.util.Scanner;

/**
 * transpose
 */
public class transpose {

    public static void main(String[] args) {
        int i,j;
        int input[][] = new int[3][3];
        int transpose[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 3 * 3 matrix :");
        for(i =0;i<3;i++){
            for(j=0; j<3;j++){
                input[i][j] = s.nextInt();
            }
        }
        for(i =0;i<3;i++){
            for(j=0; j<3;j++){
                transpose[i][j] = input[j][i];
            }
        }

        System.out.println("Transpose matrix :");
        
        for(i =0;i<3;i++){
            for(j=0; j<3;j++){
              System.out.print(transpose[i][j] + " ");
            }
            System.out.print('\n');
        }

        
    }
}