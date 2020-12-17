package ua.mainacademy.main.service;

public class MathOperationService {

    public static int getSumByDataTransferring(int number) {
        int sum = 0;
        char[] chars = String.valueOf(number).toCharArray();
        for (char c : chars) {
            int element = Character.getNumericValue(c);
            sum = sum + element;
        }
        return sum;
    }

    public static int getSumByMathOperations(int number) {
        int sum = 0;
        int division = 10;
        while (number > 0) {
            int divider = number % division;
            sum = sum + divider;
            number = number / division;
        }
        return sum;
    }
}
