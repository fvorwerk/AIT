/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 01.12.2016
  * @author 
  */
  
  import java.util.*;

public class SelectionSort {
  
  public static void main(String[] args) {
    
    Random rand = new Random();
    
    int[] array = new int[19] ;
    
    for (int z = 0 ; z < 19 ; z++ ) {
      int random = rand.nextInt(100) + 1 ;
      array[z] = random;
    } // end of for
    
    System.out.println("Array " + Arrays.toString(array));
    
    for (int i = 0; i < array.length -1 ; i++ ) {
      for (int j = i +1 ; j < array.length ; j++ ) {
        if (array[i] > array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
          
        } // end of if
        
      } // end of for
      
    } // end of for
    
    System.out.println("Array sortiert" + Arrays.toString(array));
    
  } // end of main

} // end of class SelectionSort
