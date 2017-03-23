/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 17.11.2016
  * @author Vorwerk.harambe-coding.com 
  */

  import java.util.*;

public class Primzahl {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Bitte geben Sie eine Zahl ein!");
    int zahl = scan.nextInt();
    boolean prime = false;
    
    if (zahl == 1) {
      System.out.println( zahl + " ist keine Primzahl");
      
    } else {
      for (int i = 2; i < zahl ; i++ ) {
        if (zahl%i==0) {
          prime = true;
        } // end of if
      } // end of for
    } // end of if-else
    
    if (prime == true) {
      System.out.println(zahl + " ist eine Primzahl.");
    } // end of if
    if (prime == false) {
      System.out.println(zahl + " ist keine Primzahl.");
    } // end of if
    
    
    
  } // end of main
  
} // end of class Primzahl
