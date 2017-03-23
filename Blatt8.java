/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.01.2017
  * @author 
  */
  
import java.util.*;

public class Blatt8 {
  
  public static void main(String[] args) {
    
    System.out.println("Wie viel Jahre sind zu verzinsen?");
    
    Scanner scan = new Scanner(System.in);
    int jahre = scan.nextInt();
    
    System.out.println("Der Betrag hat nach " + jahre + " Jahren, einen Betrag von " + verzinsung(jahre) + " erreicht.");
    
  } // end of main
  
  //Kapital
  public static double verzinsung(int jahre) {
    
    double kapital = 1000;
    
    if (jahre > 0 ) {
      return verzinsung(jahre-1)*1.05;
      
      } else {
        return kapital;
      } // end of if-else
    
    
    }

} // end of class Blatt8
