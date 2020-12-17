package lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Привет дорогой друг, комп загодал число от 0 до 9");
        System.out.println("Давай попробуем угодать какое число загадал комп");
        play();

    }
    // 1. Написать программу, которая загадывает случайное
    // число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
    // чем загаданное, или меньше. После победы или проигрыша выводится запрос –
    // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    static void play () {
        Scanner scanner = new Scanner(System.in);
        int ran = (int) (Math.random()*10);
        System.out.println("Вводи свое число:");
        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            if (i == 2) {
                if (a == ran) {
                    System.out.println("Поздравляю вы угадали");
                }else {
                    System.out.println("Очень плохо все варианты не правильные");
                }
                replay();
                break;
            }
            else if (a > ran) {
                System.out.println("число меньше");
            }else if (a < ran) {
                System.out.println("число больше");
            }else {
                System.out.println("вы угадали");
                replay();
                break;
            }
        }

    }
   static void replay () {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Давай сыграем еще раз? 1/да 0/нет");
       int a = scanner.nextInt();
       if (a == 1) {
           play();
       }else {
           System.out.println("Спачибо за игру");
       }
   }

}
