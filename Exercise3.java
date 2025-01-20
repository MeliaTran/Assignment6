package Assignment6;

import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(40.4);
        prices.add(5.49);
        prices.add(7.49);
        prices.add(3.75);
        prices.add(30.2);

        System.out.println("Prices of products:");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println("Price " + (i + 1) + ": " + prices.get(i)+ " VND");
        }
    }
}
