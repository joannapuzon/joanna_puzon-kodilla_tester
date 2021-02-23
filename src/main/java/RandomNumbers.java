import java.util.Random;

public class RandomNumbers {


    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt(31);
        for (int i = 0; i < 36; i++) {

            int sum = 0;
            int max = 5000;
            int minNum = 30;
            int maxNum = 0;


            while (sum <= max) {
                int temp = random.nextInt(31);
                System.out.println(random.nextInt(31));
                sum = sum + temp;
                if (temp < minNum) {
                    minNum = temp;
                } else if (temp > maxNum) {
                    maxNum = temp;
                }

                System.out.println(maxNum);
                System.out.println(minNum);
            }
        }
    }
}