package math.problems;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class UnitTestingMath {
    @Test
    public void testFindLowestDifference() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int Actual =FindLowestDifference.lowestDifference(array1,array2);
        int Expected =1;
        Assert.assertEquals(Expected,Actual);
        System.out.println("test passed");
    }
    @Test
    public void testFibonacci(){

        List<Integer> Expected = new ArrayList<>();
        List<Integer> Actual = new ArrayList<>();
        Actual = Fibonacci.fibonacci();
        Expected = Arrays.asList(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,
                10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269,2178309,
                3524578,5702887,9227465,14930352,24157817,39088169,63245986);

        Assert.assertEquals(Expected,Actual);
        System.out.println("test passed");

    }


    }



