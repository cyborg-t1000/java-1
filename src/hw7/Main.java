package hw7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Cat[] cats = new Cat[10];

        for (int i = 0; i < 10; i++) {
            cats[i] = new Cat("Murzik-" + i, random.nextInt(50));
        }

        Plate plate = new Plate(100);
        plate.increaseFood(20);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        plate.info();

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }

    }
}
