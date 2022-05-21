package math.problems;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static math.problems.RecursiveFactorial.factorialFunction;

public class UnitTestingMath {
    @Test
    public void testFindLowestDifference() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int actualResult = FindLowestDifference.lowestDifference(array1, array2);
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testFibonacci() {

        List<Integer> Expected = new ArrayList<>();
        List<Integer> Actual = new ArrayList<>();
        Actual = Fibonacci.fibonacci();
        Expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
                10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
                3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986);

        Assert.assertEquals(Expected, Actual);
        System.out.println("test passed");

    }

    @Test
    public void testFindMissingNumber() {
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int expectedResult = 9;
        int actualResult = FindMissingNumber.missingNumber(array);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");

    }

    @Test
    public void testIterativeFactorial(){
        int factorialProduct = 1;
        int expectedResult = 120;
        int actualResult = IterativeFactorial.iterativeFactorial();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testRecursiveFactorial() {
        long nFactorial = factorialFunction(5);
        int expectedResult = 120;
        int actualResult = RecursiveFactorial.recursiveFactorial();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testLowestNumber() {
        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56,
                78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        int expectedResult = 5;
        int actualResult = LowestNumber.lowestNumber();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testMakePyramid() {
        int n = 6;
        int expectedResult = 6;
        int actualResult = MakePyramid.pyramid();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");

    }

    @Test
    public void testPattern() {
        int actualResult = Pattern.pattern();
        Assert.assertEquals(-1, actualResult);
        System.out.println("test passed");
    }

    @Test
    public void testPrimeNumber() {
        int expectedResult = 1;
        int actualResult = PrimeNumber.primeNumber(18);
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("test passed");

    }
}



