import java.util.Scanner;

public class Totalexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        double total = qty * price;

        if (total > 5000)
            total = total - (total * 0.10);

        System.out.println("Total expense: " + total);
    }

}
