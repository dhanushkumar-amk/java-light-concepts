/**
 * enumdata
 */
public class enumdata {

    enum days{
        sunday,
        monday,tuesday,wednesday,thursday,
        friday,saturday
    }

public static void main(String[] args) {
    for(days d : days.values()){
        weekend(d);
    }

}
   
static void weekend(days d){
      if(d == days.sunday){
        System.out.println("Holiday");

      }  
      else{
        System.out.println("working day");
      }

} 
}