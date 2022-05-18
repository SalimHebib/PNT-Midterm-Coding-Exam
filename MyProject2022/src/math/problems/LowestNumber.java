package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {
    public static void main(String args[]) {

        int[] array = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        int size = array.length;
        Arrays.sort(array);
        int result = array[0];

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> lowestValue = new ArrayList<String>();
        try {
            connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
            lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

        } catch (Exception e) {
            e.printStackTrace();
        }
       System.out.println("lowestNumber  is :" + result);

    }
}