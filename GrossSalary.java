import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        double hra, da;

        if (basic < 1500) {
            hra = 0.10 * basic;
            da = 0.90 * basic;
        } else {
            hra = 500;
            da = 0.98 * basic;
        }

        double gross = basic + hra + da;
        System.out.println("Gross Salary: " + gross);
    }

}
