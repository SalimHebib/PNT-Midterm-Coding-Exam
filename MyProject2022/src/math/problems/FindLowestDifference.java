package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        Arrays.sort(array1);
        Arrays.sort(array2);
        if (array1[0] < array2[0]) {
            System.out.println(array1[0]);
        } else {
            System.out.println(array2[0]);
        }
    }

     public static int lowestDifference(int[] array1, int[] array2) {
         return 0;
     }
}
