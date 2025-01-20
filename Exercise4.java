package Assignment6;

import java.util.ArrayList;

public class Exercise4 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");

        boolean containsLondon = cities.contains("London");

        if (containsLondon) {
            System.out.println("The list contains the city: London");
        } else {
            System.out.println("The list does not contain the city: London");
        }
    }
}
