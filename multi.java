class student {
    int rollno;
    void getNumber(int n){
        rollno = n;
    }
    void putNumber(){
        System.out.println(rollno);
    }
}

// second class

class test extends student{
    float part1;
    float part2;

    void getMark(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }
    void putMark(){
        System.out.println("Mark Obtained");
        System.out.println(part1);
        System.out.println(part2);
    }

}

// third class

interface sports{
    float sportsScore = 100;
    void putSportsScore();




}

// next class

class result extends test implements sports{
    float total;
    public void putSportsScore(){
        System.out.println(sportsScore);
    }
 void display(){
    total = part1 + part2 + sportsScore;
    putNumber();
    putMark();
    putSportsScore();
    System.out.println(total);
 }

}


// last class
public class multi {
public static void main(String[] args) {
    result r = new result();
    r.getNumber(10);
    r.getMark(100, 100);
    r.display();
}
    
}