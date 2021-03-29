import java.util.Scanner;

public class Color {

    public String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the letter of color (R-red, O-orange, B-black, G-green):");
            String result = scanner.nextLine().trim().toUpperCase();

            switch (result) {
                case "R":
                    return "RED";

                case "O":
                    return "ORANGE";

                case "B":
                    return "BLACK";

                case "G":
                    return "GREEN";

                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }
}