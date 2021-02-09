import java.util.*;

public class MyArray {   
public static int productOfOdds(int[] arr, int size) { //if and else if 
           if (size == 1)
           {
           if ((arr[size-1]%2) != 0)
               return arr[size-1];
           else
               return 1;
           }

           else if((arr[size-1]%2) != 0 )   
               return (arr[size-1] * productOfOdds(arr, size-1));
               
           else
               return productOfOdds(arr, size-1);
           }
      //if and else if does the computation of the array 
public static void main(String[] args) {  //definition of the array
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter 6 odd and even numbers: "); // input 
       int[] arr = new int[12]; //array size (in order to plug in 6 odd and even you would need space for 12)
       int size = arr.length;
           
           for(int i=0;i<size;i++) {
               arr[i] = sc.nextInt();
           }
           System.out.println("The array:"+Arrays.toString(arr));    //array output
           System.out.println("Product of odds:"+productOfOdds(arr,size)); // product for odd numbers
   }
   }