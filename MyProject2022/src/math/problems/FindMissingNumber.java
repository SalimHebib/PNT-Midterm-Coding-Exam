package math.problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("The missing number is: " + missingNumber(array));
    }
    public static int missingNumber(int[] array){
        int arraySize = array.length + 1;
        int sum = (arraySize * (arraySize + 1)) / 2;
        int valuesSum = 0;
        for (int i = 0; i < array.length; i++) {
            valuesSum += array[i];
        }
        int missingNumber = sum - valuesSum;

        return missingNumber;
    }
}


