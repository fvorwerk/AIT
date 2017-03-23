import java.util.*;
public class Gluecksspiel {
  public static void main (String[] args) {
    
    System.out.println("________________________________________________________________");
    System.out.println(" __   __  _______  ______    _______  __   __  _______  _______ ");
    System.out.println("|  | |  ||   _   ||    _ |  |   _   ||  |_|  ||  _    ||       |");
    System.out.println("|  |_|  ||  |_|  ||   | ||  |  |_|  ||       || |_|   ||    ___|");
    System.out.println("|       ||       ||   |_||_ |       ||       ||       ||   |___ ");
    System.out.println("|       ||       ||    __  ||       ||       ||  _   | |    ___|");
    System.out.println("|   _   ||   _   ||   |  | ||   _   || ||_|| || |_|   ||   |___ ");
    System.out.println("|__| |__||__|_|__||___|__|_||__|_|__||_|   |_||_______||_______|");
    System.out.println("________________________________________________________________");
    System.out.println("-G-----L-----Ü-----C-----K-----S-----S-----P-----I-----E-----L--");
    System.out.println();
    
    System.out.println("Spieler 1");
    System.out.println("Bitte geben Sie Ihren Namen ein");
    Scanner name1s = new Scanner(System.in);
    String name1 = name1s.next();
    clear();
    System.out.println("Spieler 1: Bitte wählen eine Zahl zwischen 1 und 100");
    Scanner p1s = new Scanner(System.in);
    int p1 = p1s.nextInt();
    clear();
    
    System.out.println("Spieler 2");
    System.out.println("Bitte geben Sie Ihren Namen ein");
    Scanner name2s = new Scanner(System.in);
    String name2 = name2s.next();
    clear();
    System.out.println("Spieler 2: Bitte wählen eine Zahl zwischen 1 und 100");
    Scanner p2s = new Scanner(System.in);
    int p2 = p2s.nextInt();
    
    Random rand = new Random();
    int zahl = rand.nextInt(101);
    
    
    //Berechnung
    
    int a = zahl - p1s;
    int b = zahl - p2s;
    
    if (a<zahl) {
      a = a * -1;
    } // end of if
    
    if (b<zahl) {
      b = b * -1;
    } // end of if
    
    //Vergleichen
    
    if (a<b) {
      System.out.println("Spieler 1 hat gewonnen");
    } // end of if
    
    if (a>b) {
      System.out.println("Spieler 2 hat gewonnen");
    } // end of if
    if (a==b) {
      System.out.println("Beide verloren ihr looser");
    } // end of if
    
  }
    
    public static void clear(){
    for (int j = 0; j < 100  ; j++ ) {
      System.out.println("");
      
    } // end of for
  } 
  
}