package Hamster;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Hamster[] hamsters = new Hamster[]{
                new Hamster("Пушок", 150.5, 2, "Белый", true, false),
                new Hamster("Корочка", 120, 3, "Рыжий", false, false),
                new Hamster("Шалун", 199.9, 4, "Чёрный", false, false),
                new Hamster("Снежинка", 175.9, 4, "Рыжий", false, false),
                new Hamster("Штучка", 199.9, 7, "Чёрный", true, true),
                new Hamster("Баранка", 173.8, 5, "Рыже-белый", true, false),
                new Hamster("Ниндзя", 168, 3, "Рыже-белый", true, false)
        };
        String[] hamster2 = new String[7];

        System.out.println("В конкурсе «Рыжий хомяк года» смогут участвовать:");
        for (int i = 0; i < hamsters.length; i++) {
            Hamster hamster = hamsters[i];

            // Составьте условие отбора с помощью дополнительных переменных
            boolean isColor = false; // если рыжий
            boolean isWeight = false;
            boolean isAge = false;

            if (hamster.weight > 150 && hamster.weight < 200) {
                isWeight = true;
            }
            if (hamster.color.equals("Рыжий")) {
                isColor = true;
            }
            if (hamster.age > 2) {
                isAge = true;
            }

            if (isColor) {
                hamster2[i] = hamster.name;
            }
            if (isWeight) {
                hamster2[i] = hamster.name;
            }
            if (isAge) {
                hamster2[i] = hamster.name;
            }

            System.out.println(Arrays.toString(hamster2));

        }
    }
}
