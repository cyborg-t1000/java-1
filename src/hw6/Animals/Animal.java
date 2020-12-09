package hw6.Animals;

public class Animal {
    private String name;
    protected int maxRun;
    protected int maxSwim;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        if (distance > this.maxRun) {
            distance = this.maxRun;
        }
        System.out.printf("%s пробежал %d м.\n", this.name, distance);
    }

    public void swim(int distance) {
        if (distance > this.maxSwim) {
            distance = this.maxSwim;
        }
        System.out.printf("%s проплыл %d м.\n", this.name, distance);
    }
}
