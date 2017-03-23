/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.01.2017
  * @author 
  */
import java.util.*;
public class Medikament {
  
  public static void main(String[] args) {
    
    System.out.println("Wann getaked: ");
  
    Scanner scan = new Scanner(System.in);
    int tage = scan.nextInt();
    
    System.out.println("Es bleiben " + medimenge(tage) + "mg von den Medis in deinem Boday.");
        
  } // end of main
  
  public static double medimenge(int tage){
    
    double medirest = 5.0;
    
    if (tage > 0) {
      return  medimenge(tage-1) + medimenge(tage-1)*0.4;
                        
      } else {
        return medirest;
      } // end of if-else
    
    }

} // end of class Medikament
