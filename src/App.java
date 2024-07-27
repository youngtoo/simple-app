import duke.choice.Clothing;

public class App {
    public static void main(String[] args) throws Exception {
        double tax = 0.2;
        double total, totalTax;

        System.out.println("Hello, World!");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        // Ian bought 3 items

        // Item 1
        item1.size = "S";
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        // Item 2
        item2.size = "S";
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;

        // Bought 2 Tshirts and 1 Jacket
        totalTax = tax * ( ( 2 * item2.price ) + item1.price );
        total = ( totalTax + ( ( 2 * item2.price ) + item1.price ));

        System.out.println("You bought: 2 " + item2.description + " and 1 " + item1.description);
        System.out.println("Total purchases: " + total);

    }
}
