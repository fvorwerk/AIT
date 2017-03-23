import java.util.*;
public class Menue {
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
    
    
    System.out.println("Spieler 1");
    System.out.println("Bitte geben Sie Ihren Namen ein");
    Scanner names = new Scanner(System.in);
    String name1 = names.next();
    clear();
    System.out.println("Bitte geben Sie Ihr Alter ein");
    Scanner alters = new Scanner(System.in);
    int alter = alters.nextInt();
    clear();
    System.out.println("Bitte geben Sie Ihr Geschelcht an");
    System.out.println("1 = Weiblich; 2 = Männlich; 3 = Apache Kampfhelikopter");
    Scanner geschlechts = new Scanner(System.in);
    int geschlecht = geschlechts.nextInt();
    clear();
    
    String begruessung1 = "";
    String begruessung2 = "";
    
    
    if (alter > 18) {
      begruessung1 = begruessung1 + "Guten Tag ";
      if  (geschlecht == 1) {
        begruessung1 = begruessung1 + "Frau ";
        begruessung1 = begruessung1 + name1;
        
      } else if (geschlecht == 2) {
        begruessung1 = begruessung1 + "Herr ";
        begruessung1 = begruessung1 + name1;
      }
      else if (geschlecht == 3) {
        clear();
        System.out.println("SUCH DIR 'N JOB!");
        System.exit(0);
      }
    } else  {
      begruessung1 = begruessung1 + "Hallo ";
      begruessung1 = begruessung1 + name1;
    }
    clear();
    System.out.println("Spieler 2");
    System.out.println("Bitte geben Sie Ihren Namen ein");
    Scanner names5 = new Scanner(System.in);
    String name2 = names5.next();
    clear();
    System.out.println("Bitte geben Sie Ihr Alter ein");
    Scanner alters = new Scanner(System.in);
    int alter = alters.nextInt();
    clear();
    System.out.println("Bitte geben Sie Ihr Geschelcht an");
    System.out.println("1 = Weiblich; 2 = Männlich; 3 = Apache Kampfhelikopter");
    Scanner geschlechts = new Scanner(System.in);
    int geschlecht = geschlechts.nextInt();
    clear();
    
    String begruessung = "";
    
    if (alter > 18) {
      begruessung2 = begruessung2 + "Guten Tag ";
      if  (geschlecht == 1) {
        begruessung2 = begruessung2 + "Frau ";
        begruessung2 = begruessung2 + name2;
        
      } else if (geschlecht == 2) {
        begruessung2 = begruessung2 + "Herr ";
        begruessung2 = begruessung2 + name2;
      }
      else if (geschlecht == 3) {
        clear();
        System.out.println("SUCH DIR 'N JOB!");
        System.exit(0);
      }
    } else  {
      begruessung2 = begruessung2 + "Hallo ";
      begruessung2 = begruessung2 + name2;
    }
    
    
    
    
    
    
    System.out.println(begruessung1);
    System.out.println(begruessung2);
    
    
    
  }
  
  public static void clear(){
    for (int j = 0; j < 100  ; j++ ) {
      System.out.println("");
      
    } // end of for
  } 
  
}