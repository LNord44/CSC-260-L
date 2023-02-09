import java.util.Scanner;

public class Program3A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting city: ");
        String city1 = in.nextLine();
        System.out.print("Enter the ending city: ");
        String city2 = in.nextLine();
        System.out.print("Enter distance in miles between cities: ");
        int distance = in.nextInt();
        System.out.print("Enter the cost of travel per mile: ");
        double costPerMile = in.nextDouble();
        int dollarAmount = (int)(distance * costPerMile);
        System.out.println("\n\nThe cost of traveling from " +
                city1 + " to " + city2 + " is $" + dollarAmount);
        in.close();
    }
}