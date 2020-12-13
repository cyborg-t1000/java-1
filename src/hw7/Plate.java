package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (amount < 0) {
            return false;
        }
        // Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например,
        // в миске 10 еды, а кот пытается покушать 15-20)
        if (food < amount) {
            return false;
        }
        food -= amount;
        return true;
    }

    public void info() {
        System.out.println("Food: " + food);
    }

    // Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
    public void increaseFood(int amount) {
        food += amount;
    }
}
