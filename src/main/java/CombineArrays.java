//import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        // start out with finding the length of the two int []
        int a1 = arr1.length;
        int a2 = arr2.length;
        // combine the two into an array by making a new int [] array
        int[] a3 = new int[a1 + a2];
         // instantiate another int as current position to use in the for loopss
        int cp = 0;
        // do two for loops, one for arr1 and arr2
        for (int i = 0; i < a1; i++) {
            a3[cp] = arr1[i];
            cp++;
        }
        for ( int j = 0; j < a2; j++) {
            a3[cp] = arr2[j];
            cp++;
        }
        //return the combine arrays in the new array
        return a3;
    }
}

       
        // int a1 = arr1.length;
        // int a2 = arr2.length;
        // int a3 = a1 + a2;
        // int[] arr3 = new int[a3];
        // System.arraycopy(arr1, 0, arr3, 0, a1);
        // System.arraycopy(arr2, 0, arr3, 0, a2);