

public class Test {
  
  public static void main(String[] args) {
    
    boolean check = false;
    double x = 5;
    double y = 8;
    
    if (x == (sub(x,y))+y) {
      check = true;
    } // end of if
    
    System.out.println(check);
    System.out.println(add(2,2));
    System.out.println(multi(5,5));
    System.out.println(pow(2,3));
    
    
    
  } // end of main
  
  public static double add (double x, double y) {
    return  x + y;
  }
  
  public static double sub (double x, double y) {
    return  x - y;
  }
  
  public static double multi (double x, double y) {
    double ergebnis = 0;
    for (int i = 0; i < y  ; i++ ) {
      ergebnis =add(ergebnis, x);
      
    }
    return ergebnis;
  }
  
  public static double pow (int basis, int exponent) {
    double ergebnis = 0;
    for (int i = 1; i < exponent ; i++ ) {
      ergebnis = ergebnis + multi(basis,basis);
      
    } // end of for
    return ergebnis;
    
    }
  
  
  
} // end of class Test
  