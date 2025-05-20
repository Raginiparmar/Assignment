import java.util.Scanner;

public class YoungestAmongThree {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram's age: ");
        int ram = sc.nextInt();
        System.out.print("Enter Sulabh's age: ");
        int sulabh = sc.nextInt();
        System.out.print("Enter Ajay's age: ");
        int ajay = sc.nextInt();

        if (ram < sulabh && ram < ajay)
            System.out.println("Ram is the youngest");
        else if (sulabh < ram && sulabh < ajay)
            System.out.println("Sulabh is the youngest");
        else
            System.out.println("Ajay is the youngest");
    }

    
}
