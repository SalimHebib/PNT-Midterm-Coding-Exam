package datastructure;
import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {

        ArrayList<String> CityName = new ArrayList<>();

        CityName.add("NYC");
        CityName.add("MIAMI");
        CityName.add("LA");
        CityName.add("CHICAGO");
        CityName.add("HOUSTON");
        CityName.add("CALIFORNIA");
        CityName.add("HAWAII");

        System.out.println(CityName);

        System.out.println(CityName.get(2));

        CityName.add("LONDON");
        System.out.println("After Adding LONDON " + CityName);

        CityName.remove("HOUSTON");
        System.out.println("After Removing HOUSTON " + CityName);

        System.out.println("**** using for each loop ****");
        for (String fruit : CityName) {
            System.out.println(fruit);
        }

        System.out.println("**** using iterator ****");

        Iterator<String> it = CityName.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("***** After Sorting ****");
        Collections.sort(CityName);
        Iterator<String> it2 = CityName.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }

}

