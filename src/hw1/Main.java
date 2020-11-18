package hw1;

public class Main {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.6f;
        double d = 7.8;
        char c = 'a';
        boolean flag = true;
        String str = "Hello";

        float result3 = expression(2, 3, 4, 5);
        System.out.printf("Result 3: %f\n", result3);

        boolean result4 = sumInRange(2, 3);
        System.out.printf("Result 4: %b\n", result4);

        printNumSign(1);

        boolean result6 = isNegative(2);
        System.out.printf("Result 6: %b\n", result6);

        greeting("Ivan");

        isLeapYear(2020);
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float expression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void printNumSign(int a) {
        if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    // отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int a) {
        return a < 0;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в
    // консоль сообщение «Привет, указанное_имя!».
    public static void greeting(String name) {
        System.out.printf("Привет, %s!\n", name);
    }

    // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год
    // является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year) {
        if(year % 400 == 0) {
            System.out.printf("Year %d is a leap year", year);
            return;
        }
        if(year % 100 == 0) {
            System.out.printf("Year %d is not a leap year", year);
            return;
        }
        if(year % 4 == 0) {
            System.out.printf("Year %d is a leap year", year);
            return;
        }
        System.out.printf("Year %d is not a leap year", year);
    }
}
