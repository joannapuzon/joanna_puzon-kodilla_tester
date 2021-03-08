import java.util.Scanner;

public class Color {


    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of color");
            String colors = scanner.nextLine().trim();
            if (colors.length() >= 1) {
                return colors;
            }
            System.out.println("Name of color is too long. Write first letter");
        }
    }

    public String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the letter of color (R-red, O-orange, B-black, G-green):");
            String calc = scanner.nextLine().trim().toUpperCase();
            String UserSelected = Color.getUserColor();
            String result = "0";
            switch (calc) {
                case "R":
                    result = "RED";
                    break;
                case "O":
                    result = "ORANGE";
                    break;
                case "B":
                    result = "BLACK";
                    break;
                case "G":
                    result = "GREEN";
                    break;
                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }
    public String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letter");
        String color=scanner.nextLine();
        return color;
    }
}