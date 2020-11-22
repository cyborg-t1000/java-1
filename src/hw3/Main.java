package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать
        // это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем
        // загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        // 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        guessNum();

        // 2 * Создать массив из слов
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //guessWord(words);
    }

    public static void guessNum() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int gameActive = 1;

        do {
            int guessedNum = random.nextInt(10);
            int attemptsLeft = 3;
            do {
                System.out.printf("У вас осталось поыток: %d. Ваше число: ", attemptsLeft);
                int num = sc.nextInt();
                if (num > guessedNum) {
                    System.out.println("Неправильно. Загаданное число меньше");
                } else if (num < guessedNum) {
                    System.out.println("Неправильно. Загаданное число больше");
                } else {
                    System.out.println("Вы угадали");
                    break;
                }
                attemptsLeft--;
            } while (attemptsLeft > 0);
            if (attemptsLeft == 0) {
                System.out.printf("У вас закончились попытки. Было загадано число %d\n", guessedNum);
            }
            System.out.print("Повторить игру еще раз? (1 – да / 0 – нет): ");
            gameActive = sc.nextInt();
        } while (gameActive == 1);
    }
}
