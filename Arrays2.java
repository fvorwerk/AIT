import java.util.*;

public class Arrays2 {
  
  public static void main(String[] args) {
    
    int[] array = {5, 2, 4, 6, 8, 7};
    System.out.println("Hier isch dei Array DU! DU!");
    System.out.println(Arrays.toString(array));
    
                                                                                                
    for (int i = 0 ; i < array.length ; i++) {
      if (i > array[i]) {
        System.out.println(array[i]);
        } // end of if  
      
      }
      
    
  } // end of main

} // end of class Arrays2
