 
public class ArrayOps {
  //takes an array of int, and returns a sum of the individual values in the array.
  public static int sum(int[] arr) {
    int sum=0;
    for (int i=0; i<arr.length; i++){
      sum+= arr[i];
    }
    return sum;
   }

  //largest() takes a non-empty array of int, and returns the largest element of the array. [The problem states a precondition, the array must not be empty,
  //this means you do not have to account for this at all. You are allowed to assume it to be true. This means the prior problem affords you no such assumptions,
  //and must work on ALL array of ints.]
  public static  int largest(int[]arr) {
    int biggest =0;
    for (int i=0; i <arr.length; i++){
      if (arr[i]> biggest){
        biggest = arr[i];
      }
    }
    return biggest;
  }

  //sumRows()` takes a 2D array of int, and returns a 1D array of int with each element being the sum of the individual rows of the 2D array.
  public static int[] sumRows(int[][] matrix) {
    int [] sums = new int [matrix.length];
    for (int i=0; i< matrix.length; i++){
        sums[i]=sum(matrix[i]);

    }
    return sums;
  }

}
