import java.util.Arrays;
public class Tester{
  public static void main(String args[]){
    int arr0[]={};
    int arr1[][]= {{},{}};
    int[][]  A = { {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
    int[]  B  =   {  1, 3, 5 };

    int[][]E = {
      {  2,  4, 2 },
      {  2, 2, 2 }
    };

    System.out.println (ArrayOps.sum (arr0));
    System.out.println (ArrayOps.largest (B));
    System.out.println (Arrays.toString(ArrayOps.sumRows (A)));
    System.out.println (Arrays.toString(ArrayOps.largestInRows(A)));
    System.out.println (Arrays.toString(ArrayOps.sumRows (arr1)));
    System.out.println (Arrays.toString(ArrayOps.largestInRows(arr1)));
    System.out.println( ArrayOps.sum(B));
    System.out.println (ArrayOps.sum(A));
    System.out.println( ArrayOps.sum(arr1));
    System.out.println (ArrayOps.sum(arr0));
    System.out.println( Arrays.toString(ArrayOps.sumCols(A)));
    System.out.println( Arrays.toString(ArrayOps.sumCols(arr1)));
    System.out.println(ArrayOps.isRowMagic(A));
    System.out.println(ArrayOps.isRowMagic(arr1));
    System.out.println(ArrayOps.isColMagic(A));
    System.out.println(ArrayOps.isColMagic(arr1));
    System.out.println(ArrayOps.isLocationMagic(E, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
    System.out.println(ArrayOps.isLocationMagic(arr1, 0, 1));
  }
}
