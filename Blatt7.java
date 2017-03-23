/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.01.2017
  * @author 
  */
  
import java.util.*;

public class Blatt7 {
  
  public static void main(String[] args) {
    
    System.out.println("Gib mir dein n: ");
    Scanner nscan = new Scanner(System.in);
    int n = nscan.nextInt();
    
    System.out.println("Gib mir dein m: ");
    Scanner mscan = new Scanner(System.in);
    int m = mscan.nextInt();
    
    System.out.println("Fak (1) oder Fib (2) oder Ack (3)");
    Scanner menuscan = new Scanner(System.in);
    int menu = menuscan.nextInt();
    
    if (menu == 1) {
      System.out.println(fak(n));
      
    } else if (menu ==2){
      System.out.println(fib(n));
    } else if (menu ==3){
      System.out.println(ack(n,m));
    }
    
  } // end of main
  
  
  //Fakultät
  
  public static int fak(int n){                                 
    if (n==0) {
      return 1; 
    } else {
      return fak(n-1)*n;
    } // end of if-else
  }
  
  
  //Fibonacci 
  public static int fib(int n){
    if (n == 0) {
      return 0;
    } else if  (n == 1){
      return 1;
    } else {
      return fib(n-1) + fib(n-2);
    }
  }
  
  
  //Ackermann
  public static int ack (int n, int m){
    if (n == 0) {
      return m + 1;
    } if (m == 0) {
      return ack(n-1,1);
      
    } else {
      return ack(n-1, ack(n,m-1));
    } // end of if-else
    
  }  
  
} // end of class Blatt7
