package ua.mainacademy.main;

import ua.mainacademy.main.service.MathOperationService;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathOperationService.getSumByDataTransferring(54));
        System.out.println(MathOperationService.getSumByMathOperations(1235555555));
    }
}
