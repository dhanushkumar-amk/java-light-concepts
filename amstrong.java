/**
 * amstrong
 */
public class amstrong {

    public static void main(String[] args) {
        int i,number,total,temp;

        for(i=1;i<=500;i++){
            number =i;
            total =0;
            temp=0;

            while (number != 0) {
                temp = number % 10;
                total= total + temp * temp * temp;
                number /= 10;
                
            }
            if(total == i){
                System.out.println(i);
            }
        }
    }
}