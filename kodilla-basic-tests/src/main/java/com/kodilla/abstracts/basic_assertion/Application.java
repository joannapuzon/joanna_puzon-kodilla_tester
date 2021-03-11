package com.kodilla.abstracts.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        double powResult = calculator.pow(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("The sum method is working properly for numbers " + a + "i" + b);
        } else {
            System.out.println("The sum method is not working properly for numbers " + a + "i" + b);
        }

        boolean correct1 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct1) {
            System.out.println("The subtract method is working properly for numbers " + a + "i" + b);
        } else {
            System.out.println("The subtract method is not working properly for numbers " + a + "i" + b);
        }

        boolean correct2 = ResultChecker.assertEqual(390625, powResult);
        if (correct2) {
            System.out.println("The pow method is working properly for numbers " + a + "i" + b);
        } else {
            System.out.println("The pow method is not working properly for numbers " + a + "i" + b);
        }
    }
}