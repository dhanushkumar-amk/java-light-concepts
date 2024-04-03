class student{
    int age;
    String name;
 student( int age, String name){
        this.name =name;
        this.age  = age;
    }
}

class employee extends student{
    int empid; int empsalary;
  employee(String name, int age, int salary, int id){
    super( age, name);
        empid = id;
        empsalary = salary;
    }

    void printdetails(){
        System.out.println(name);
    
        System.out.println(age);
        System.out.println(empsalary);
        System.out.println(empid);
    }




}
public class singleInheritance {
public static void main(String[] args) {
    employee singleInheritance = new employee("dhanushkumnar", 12, 1200000, 1);
    singleInheritance.printdetails();
}
    
}