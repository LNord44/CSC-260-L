import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        int numerator, denominator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator: ");
        numerator = sc.nextInt();
        System.out.println("Enter Denominator: ");
        denominator = sc.nextInt();
        int reduced = (numerator % denominator);

        if (numerator >= denominator) {
            if (reduced == 0){
                System.out.println(numerator + "/" +
                        denominator + " is a improper fraction and can be reduced to " + (numerator/denominator));
                if(reduced > 0){
                    System.out.println(numerator + "/" +
                            denominator + " is a improper fraction and can be reduced to " + (numerator/denominator) + "1" + reduced + "/" +
                            denominator);
                }
            }

        }
        else {
            System.out.println(numerator + "/" + denominator +
                    " is a proper fraction");
        }
    }
}