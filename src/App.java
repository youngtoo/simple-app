import duke.choice.Clothing;
import duke.choice.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        double tax = 0.2;
        double total, totalTax;
        int measurement = 3;

        System.out.println("Hello, World!");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        // Ian bought 3 items

        // Item 1
        item1.size = "S";
        item1.description = "Blue Jacket";
        item1.price = 20.9;

        System.out.println("Item 1: " + item1.description + ", " + item1.size + ", " + item1.price);

        // Item 2
        item2.size = "S";
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;

        System.out.println("Item 2: " + item2.description + ", " + item2.size + ", " + item2.price);


        //  Clothign array
        Clothing[] clothes = new Clothing[3];

        clothes[0] = new Clothing();
        clothes[0].price = 100;
        clothes[0].description = "White Shoes";
        clothes[0].size = "S";

        clothes[1] = new Clothing();
        clothes[1].price = 150;
        clothes[1].description = "Handbag";
        clothes[1].size = "M";

        clothes[2] = new Clothing();
        clothes[2].size = "X";
        clothes[2].description ="Underwear";
        clothes[2].price = 12.99;

        System.out.println(clothes[0].description + " | " + clothes[1].description + " | " + clothes[2].description);
        System.out.println(clothes[0].size + " | " + clothes[1].size + " | " + clothes[2].size);
        System.out.println(clothes[0].price+ " | " + clothes[1].price + " | " + clothes[2].price);

        // Bought 2 Tshirts and 1 Jacket
        totalTax = tax * ( ( 2 * item2.price ) + item1.price );
        total = ( totalTax + ( ( 2 * item2.price ) + item1.price ));

        System.out.println("You bought: 2 " + item2.description + " and 1 " + item1.description);
        System.out.println("Total purchases: " + total);


        Customer customer1 = new Customer();
        customer1.customerName = "Ian Too";

        measurement = 2;
        
        switch (measurement) {
            case 1,2,3:
                customer1.size = "S";
                break;

            case 4,5,6:
                customer1.size = "M";
                break;

            case 7,8,9:
                customer1.size = "L";
                break;

            default:
                customer1.size = "X";
                break;
        }

        System.out.println("Customer: " + customer1.customerName + " has size " + customer1.size);

       for (Clothing clothing : clothes) {
        System.out.println(clothing.description + ", " + clothing.price);
       }

    }
}
