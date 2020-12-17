package lesson3;
//2. * Создать массив из слов
//
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
// "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
// "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
// с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер
// показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3A {
    public static void main(String[] args) {
        Play();
    }
    static void Play () {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
"garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
"pepper", "pineapple", "pumpkin", "potato"};
        Random set = new Random();
        int pos = set.nextInt(words.length);
        String w = words[pos];
        char [] arr = w.toCharArray();
        System.out.println("Угадайте условие из заданного массива слов:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char [] wer = a.toCharArray();
        while (!Arrays.equals(arr,wer)) {
            int lengt = Math.min(arr.length, wer.length);
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < lengt; i++) {
                if (arr[i] == wer[i]) {
                    s.append(arr[i]);
                } else {
                    s.append("#");
                }
            }
            int qw = 15 - lengt;
            String rep= "#";
            s.append(rep.repeat(qw));
            System.out.print(s);
            System.out.println();
            System.out.println("Попробуй еще раз");
            a = scanner.nextLine();
            wer = a.toCharArray();
        }
        System.out.println("Вы угадали");
    }
}
