package Scooter;

public class Scooter {
    private int availableScooters;
    private int scootersInUse;
    private final int defaultPrice = 29; // Цена аренды по умолчанию
    private final int additionalPrice = 5; // Добавочная стоимость при повышенном спросе

    Scooter(int inputAvailableScooters, int inputScootersInUse) {
        availableScooters = inputAvailableScooters;
        scootersInUse = inputScootersInUse;
    }

    void getPrice() {
        if (availableScooters < 1) {
            System.out.println("Нет доступных самокатов.");
        } else {
            int currentPrice = (((scootersInUse + 1) / availableScooters) * additionalPrice) + defaultPrice; // Посчитайте текущую стоимость проката
            System.out.println("Текущая стоимость проката: " + currentPrice + " тг/мин");
        }
    }

    void rentScooter() {
        if (availableScooters < 1) { // Проверьте, есть ли доступные самокаты
            System.out.println("Доступных самокатов не осталось.");
        } else {
            scootersInUse++;
            int currentPrice = (((scootersInUse + 1) / availableScooters) * additionalPrice) + defaultPrice; /* Посчитайте текущую стоимость проката,
            увеличьте число арендованных самокатов и уменьшите число доступных */
            availableScooters--;
            System.out.println("Выдайте самокат по цене " + currentPrice + " тг/мин");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }

    void returnScooter() {
        if (scootersInUse < 1) {
            System.out.println("Все самокаты уже возвращены.");
        } else {
            scootersInUse--;
            availableScooters++;
            System.out.println("Самокат принят.");
            System.out.println("Самокатов в аренде: " + scootersInUse);
            System.out.println("Самокатов доступно: " + availableScooters);
        }
    }
}