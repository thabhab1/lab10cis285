/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    SelectionSort sel = new SelectionSort();
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        arr = sel.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        assertArrayEquals(arr, Sortedarr);

//        for(int i = 0; i<5; i++) {
//        	System.out.println(i);
//
//
//        }
    }

    public void testNegative(){

    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        arr = sel.basicSelectionSort(arr);

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        /** add tests to check for this unit test **/
        assertArrayEquals(arr, Sortedarr);

        /** Test data contains negative values only **/
    }

    public void testMixed(){

     int[] arr = new int[5];
       arr[0] = 8;
       arr[1] = 9;
       arr[2] = -7;
       arr[3] = 10;
       arr[4] = -2;

       arr = sel.basicSelectionSort(arr);

       int[] Sortedarr = new int[5];
       Sortedarr[0] = -7;
       Sortedarr[1] = -2;
       Sortedarr[2] = 8;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;

       /** add tests to check for this unit test **/
       assertArrayEquals(arr, Sortedarr);

       /** Test data contains with both positive, negative and zeros **/
   }


   public void testDuplicates(){

     int[] arr = new int[5];
       arr[0] = 2;
       arr[1] = 9;
       arr[2] = 2;
       arr[3] = 10;
       arr[4] = 2;

       arr = sel.basicSelectionSort(arr);

       int[] Sortedarr = new int[5];
       Sortedarr[0] = 2;
       Sortedarr[1] = 2;
       Sortedarr[2] = 2;
       Sortedarr[3] = 9;
       Sortedarr[4] = 10;

       /** add tests to check for this unit test **/
       assertArrayEquals(arr, Sortedarr);

       /** Test data contains duplicates **/
   }
}
