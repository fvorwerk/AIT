/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.01.2017
  * @author 
  */
import java.util.*;

public class hanoi {
  
  public static void main(String[] args) {
    System.out.println("Anzahl der Scheiben");
    Scanner scan = new Scanner(System.in);
    
  } // end of main
  
  public static void hanoi (int n, int start, int hilf, int ziel) {
    if (n == 1) {
      System.out.println("Bewege Scheibe von " + start + " nach " + ziel);
      } else {
        hanoi(n-1, start, ziel, hilf);
        System.out.println("Bewege Scheibe von " + start + " nach " + ziel);
        hanoi ((n-1, hilf, start, ziel)+ziel)
      } // end of if-else
    
    }

} // end of class hanoi
