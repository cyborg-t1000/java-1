package hw7;

public class Cat {
    private String name;
    private boolean satiety;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.satiety = false;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        System.out.print("cat " + name + " eat... ");
        if(plate.decreaseFood(this.appetite)) {
            // Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
            // Если коту удалось покушать (хватило еды), сытость = true
            this.satiety = true;
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                ", appetite=" + appetite +
                '}';
    }
}
