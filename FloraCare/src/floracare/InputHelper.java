package floracare;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHelper {
    private Scanner input;
    public InputHelper() {
        input = new Scanner(System.in);
    }
    public int inputInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = input.nextInt();
                input.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
            }
        }
    }

    public double inputDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                double value = input.nextDouble();
                input.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
            }
        }
    }

    public String inputString(String message) {
        System.out.print(message);
        return input.nextLine();
    }
}