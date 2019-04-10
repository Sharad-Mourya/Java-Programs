package SortingArrays;

import java.util.Arrays;

public class SortArrays {


  public static void main(String[] args) {
     // SortingArraysEx();
     // SumValuesOfArray();
     // removeElementFromArray();
      maxAndMinValInArray();
  }

    public static void SortingArraysEx() {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }

    public static void SumValuesOfArray(){

      int arr[] = {1,5,8,2,9};
      int result =0;
      for(int num : arr){
        result = result + num;
      }
  System.out.print(result);
  }

  public static void removeElementFromArray(){

      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

      System.out.println("Original Array : "+Arrays.toString(my_array));

      // Remove the second element (index->1, value->14) of the array
      int removeIndex = 1;

      for(int i = removeIndex; i < my_array.length -1; i++){
          my_array[i] = my_array[i + 1];
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
      System.out.println("After removing the second element: "+Arrays.toString(my_array));

  }

  public static void maxAndMinValInArray(){
      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      int max=my_array[0];
      int min = my_array[0];

      for (int i=0;i<my_array.length-1;i++){
          if(my_array[i]>max){
              max=my_array[i];
          }
          if (my_array[i]<min){
              min=my_array[i];
          }
      }
      System.out.println("Max Value is" + max);
      System.out.println("Min Value is" + min);
  }


}
