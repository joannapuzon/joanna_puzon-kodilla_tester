public class SimpleArray {
    public static void main(String[] args) {
        String[] fruits = new String[5];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Banana";
        fruits[3] = "Pineapple";
        fruits[4] = "Grapes";
        String fruit = fruits[2];
        System.out.println(fruit);
        int numberOfElements = fruits.length;
        System.out.println(numberOfElements);
    }
}