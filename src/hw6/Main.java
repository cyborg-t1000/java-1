package hw6;

import hw6.Animals.Animal;
import hw6.Animals.Cat;
import hw6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Пушок"),
                new Dog("Шарик"),
                new Cat("Барсик"),
                new Dog("Дружок")
        };
        for (Animal a: animals
             ) {
            a.run(100);
            a.swim(20);
            a.run(50);
            a.swim(5);
        }
        System.out.printf("Животных создано: %d\n", Animal.getCount());
    }

}
