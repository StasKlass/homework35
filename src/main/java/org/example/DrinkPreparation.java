package org.example;

import java.util.Scanner;

public class DrinkPreparation {
    public static void main(String[] args) {
        String[] drinks = {"Кофе", "Чай", "Сок"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите номер напитка (0 - Кофе, 1 - Чай, 2 - Сок): ");
            String input = scanner.nextLine();

            int drinkNumber = Integer.parseInt(input);

            if (drinkNumber < 0 || drinkNumber >= drinks.length) {
                throw new ArrayIndexOutOfBoundsException("Номер напитка выходит за пределы допустимых значений.");
            }

            System.out.println("Приготовление напитка: " + drinks[drinkNumber]);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число. Пожалуйста, введите целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Завершение программы.");
            scanner.close();
        }
    }
}
