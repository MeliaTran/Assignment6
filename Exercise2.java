package Assignment6;

import java.util.ArrayList;

public class Exercise2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Orange");
        colors.add("Green");

        colors.set(1, "Yellow");
        System.out.println("Updates list of colors: " + colors);
    }
}
