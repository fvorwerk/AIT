/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 01.12.2016
  * @author 
  */
  import java.util.*;

public class SelectionSortTest {
  
    public static void main(String[] args) {
      
    		int[] unsortiert = { 4, 1, 8, -3, 5, 7 };
    		System.out.println("Array unsortiert" + Arrays.toString(unsortiert));
    		int[] sortiert = selectionsort(unsortiert);
      
    		for (int i = 0; i < sortiert.length; i++) {
     			System.out.print(sortiert[i] + ", ");
    		}
      
   	}
    
   	public static int[] selectionsort(int[] sortieren) {
    		for (int i = 0; i < sortieren.length - 1; i++) {
     			for (int j = i + 1; j < sortieren.length; j++) {
      				if (sortieren[i] > sortieren[j]) {
       					int temp = sortieren[i];
       					sortieren[i] = sortieren[j];
       					sortieren[j] = temp;
      				}
     			}
    		}
      
    		return sortieren;
    	
  } // end of main
  
} // end of class SelectionSortTest
