import java.util.*;

public class IT {
  public static void main (String[] args) {
    
    //Zahl einlesen
    System.out.println("Bitte Zahl eingeben:");
    Scanner scan = new Scanner(System.in);
    int zahl = scan.nextInt();
    
    clear();
    
    String ergebnis = "" ;
    
    for (int i = 0;i < 7 ; i++ ) {
      if (zahl % 2 == 1) {
        ergebnis = "1" + ergebnis;  
        
      } else {
        ergebnis = "0" + ergebnis;
      }// end of if
      zahl = zahl/2;
    } // end of for
    
    System.out.println("Ihr Ergebnis lautet: " + ergebnis);   
  }
  public static void clear(){
    for (int j = 0 ; j < 50 ; j ++ ) {
      System.out.println();
    } // end of for
    
  }
}
  
