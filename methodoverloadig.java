/**
 * methodoverloadig
 */
public class methodoverloadig {

    void sum(int a , int b){
        System.out.println(a + b);
    }

    void sum(int a ,int b, int c){
        System.out.println(a + b + c);
    }
public static void main(String[] args) {
    methodoverloadig m1 = new methodoverloadig();
    m1.sum(10,10);
    m1.sum(20,20,20);
}
}
