package datastructure;

import java.util.*;
import java.util.Map.Entry;

public class UseMap {

    public static void main(String[] args) {

        Map<Integer, String> worldCup = new HashMap<>();
        worldCup.put(1998, "France");
        worldCup.put(2002, "Brazil");
        worldCup.put(2006, "Italy");
        worldCup.put(2010, "Spain");
        worldCup.put(2014, "Germany");
        worldCup.put(2018, "France");

        System.out.println(worldCup);


        worldCup.remove(2014);
        System.out.println("After removing Germany " + worldCup);


        worldCup.put(2018, "France");
        System.out.println("After adding France " + worldCup);

        System.out.println("print all elements before sorting " + "\n" +" first approach");

        for (Entry<Integer, String> mp : worldCup.entrySet()) {
            System.out.println(mp.getKey() + " : " + mp.getValue());
        }
        System.out.println(" second approach ");
        // 2nd approach
        for (Integer in : worldCup.keySet()) {
            System.out.println(in + " : " + worldCup.get(in));
        }
        System.out.println(" key sorting by descending order ");
        // Sort using Tree Map in descending order
        TreeMap<Integer, String> sorted = new TreeMap<>();
        sorted.putAll(worldCup);

        for (Entry<Integer, String> mp : worldCup.entrySet()) {
            System.out.println(mp.getKey() + " : " + mp.getValue());
        }

        System.out.println(" List/HashMap ");
        List<String> teamSpain = new LinkedList<>();
        teamSpain.add("Real Madrid");
        teamSpain.add("Barcelona");
        teamSpain.add("Athletic Madrid");
        teamSpain.add("Fc Seville");
        teamSpain.add("Valencia");
        teamSpain.add("Villarreal");
        teamSpain.add("Athletic Bilbao");
        teamSpain.add("Real Sociedad");

        List<String> teamEngland = new LinkedList<>();
        teamEngland.add("Liverpool");
        teamEngland.add("Man United");
        teamEngland.add("Man City");
        teamEngland.add("Chelsea");
        teamEngland.add("Tottenham");
        teamEngland.add("Arsenal");
        teamEngland.add("Leicester");
        teamEngland.add("Everton");

        List<String> teamItaly = new LinkedList<>();
        teamItaly.add("Juventus");
        teamItaly.add("Inter Milan");
        teamItaly.add("Ac Milan");
        teamItaly.add("As Napoli");
        teamItaly.add("As Roma");
        teamItaly.add("Lazio Roma");
        teamItaly.add("Atalanta");

        HashMap<String, List<String>> map = new HashMap<>();
        map.put("Spain", teamSpain);
        map.put("England", teamEngland);
        map.put("Italy", teamItaly);
        // Print all values
        for (Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
