package Scooter;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int availableScooters;
        int scootersInUse;
        do {
            System.out.println("Сколько самокатов доступно для аренды?");
            availableScooters = Integer.parseInt(scanner.nextLine());
            if (availableScooters < 1) System.out.println("Неправильно ввели количество самоката, попробуйте снова");
        } while (availableScooters < 1);

        do {
            System.out.println("Сколько самокатов арендовано?");
            scootersInUse = Integer.parseInt(scanner.nextLine());
            if (scootersInUse < 0)
                System.out.println("Неправильно ввели количество арендованных самокат, попробуйте снова");
        } while (scootersInUse < 0);

        Scooter scooter = new Scooter(availableScooters, scootersInUse); // Создайте новый объект класса Scooter
        int command;
        do {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 -- Узнать текущую стоимость проката");
            System.out.println("2 -- Выдать самокат");
            System.out.println("3 -- Принять самокат");
            System.out.println("4 -- Завершить работу");
            System.out.println("Введите команду:");
            command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 1 -> scooter.getPrice();
                case 2 -> scooter.rentScooter();
                case 3 -> scooter.returnScooter();
                case 4 -> System.out.println("Сеанс работы завершён!");
            }
        } while (command != 4);
    }
}


