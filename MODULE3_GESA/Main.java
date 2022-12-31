import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation calculation = new Calculation();

        boolean loop = false;

        Thread trd = new Thread(calculation);

        Scanner ScannerNew = new Scanner(System.in);

        do {
            System.out.println("=== menu program ===");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            System.out.println("Select Menu: ");

            int clc = ScannerNew.nextInt();
            try {
                switch (clc) {
                    case 1:
                        System.out.println("Enter the length of the side of the square: ");
                        calculation.side = ScannerNew.nextDouble();
                        calculation.setSquare();
                        trd.start();
                        trd.join();
                        System.out.println("     ");
                        System.out.println("The calculation result: " + calculation.getSquare());
                        break;

                    case 2:
                        System.out.println("enter the radius of the circle: ");
                        calculation.radius = ScannerNew.nextDouble();
                        calculation.setCircle();
                        trd.start();
                        trd.join();
                        System.out.println("     ");
                        System.out.println("The calculation result is: " + calculation.getCircle());
                        break;

                    case 3:
                        System.out.println("Enter the side of the base of the trapezoid: ");
                        double a = ScannerNew.nextDouble();
                        System.out.println("Enter the upper side of the trapezoid: ");
                        double b = ScannerNew.nextDouble();
                        System.out.println("Enter height: ");
                        double c = ScannerNew.nextDouble();
                        calculation.setTrapezoid(a, b, c);
                        trd.start();
                        trd.join();

                        System.out.println("      ");
                        System.out.println("The calculation result: " + calculation.getTrapezoid());
                        break;

                    default:
                        System.out.println("Option not available ");
                        break;
                }
            } catch (InputMismatchException a) {
                System.out.println("input must be number ");

            } catch (IllegalArgumentException e) {
                System.out.println("Error java lang exception");
            }

        } while (loop);
        ScannerNew.close();

    }
}
