/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 24.11.2016
  * @author 
  */

import java.util.*;

public class Amina {
  
  public static void main(String[] args) {
    
    //Aufgabe 1
    //a
    
    int[] zahlenMeinerWahl = new int[10];
    zahlenMeinerWahl[0]= 420;
    zahlenMeinerWahl[1]= 69;
    zahlenMeinerWahl[2]= 88;
    zahlenMeinerWahl[3]= 187;
    zahlenMeinerWahl[4]= 1312;
    zahlenMeinerWahl[5]= 257;
    zahlenMeinerWahl[6]= 1933;
    zahlenMeinerWahl[7]= 24;
    zahlenMeinerWahl[8]= 25;
    zahlenMeinerWahl[9]= 1;
    
    System.out.println(Arrays.toString(zahlenMeinerWahl));
    
    //Aufgabe 1
    //b
    int[] zahlen = new int[10];
    for (int i = 0; i<=9 ;i++ ) {
      zahlen [i] = i;
      
    } // end of for
    System.out.println(Arrays.toString(zahlen));
    
    //Aufgabe 1
    //c
    int[] zahlenB = new int[10];
    int k = 0;
    for (int j = 9; j>=0; j-- ) {
      zahlenB [k] = j;
      k++;
    } // end of for
    System.out.println(Arrays.toString(zahlenB));
    
    //Aufgabe 1
    //d
    for (int l = 0; l<=9 ; l++ ) {
      if (zahlen[l]%2==0) {
         zahlen[l]= 0;  
      } // end of if
    } // end of for
    
    System.out.println(Arrays.toString(zahlen);
    
    
    
  } // end of main
  
} // end of class Amina
