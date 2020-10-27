public class ArrayOps {


  //takes an array of int, and returns a sum of the individual values in the array.
  public static int sum(int[] arr) {
    int sum=0;
    for (int i=0; i<arr.length; i++){
      sum+= arr[i];
    }
    return sum;
   }
   

}
