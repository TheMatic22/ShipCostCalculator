import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Item Price: ");
        double itemPrice = input.nextDouble();
        double totalPrice = itemPrice * itemPrice;

        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0;
        }
        else {
            shippingCost = itemPrice * 0.02;
        }

        System.out.println("The Shipping Cost is: $" +shippingCost);
        System.out.println("The Total Cost is: $" +totalPrice);
    }
}
