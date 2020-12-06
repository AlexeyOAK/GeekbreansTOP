
public class Main {

    public static void main(String[] args) {
        System.out.println("выражение = " + workTree(1,2,3,4)); // задание №3
        System.out.println("проверка суммы чисел = " + workFour(5, 6));
        workFive(-10);
        System.out.println(workSix(110));
        workSeven("Alex");
        workEight(2021);
        byte a = 1;
        short b = 2;
        int c = 10;
        long d = 100000;
        float i = 1010.23f;
        double f = 2333.2323;
        char j = 's';
        boolean e = true;

    }
    //3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float workTree (float a,float b,float c, float d) {
        System.out.println("задание №3");
        return a * (b +(c / d));
    }
    //4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean workFour (int a, int b) {
        System.out.println("задание №4");
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        return false;
    }
    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void workFive (int a) {
        System.out.println("задание №5");
        if (a >= 0)
            System.out.println("Число передали " + a + " Положительное");
        else
            System.out.println("Число передали " + a + " Отрицательное");
    }
    //6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean workSix (int a) {
        System.out.println("Задание №6");
        if (a < 0) {
            System.out.print("Число " + a + " Отрицательное, значит выводим ");
            return true;
        }
        else {
            System.out.print("Число " + a + " Положительное, значит выводим ");
            return false;
        }

    }
    //7. Написать метод, которому в качестве параметра передается строка,обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void workSeven (String name) {
        System.out.println("Задание №7");
        System.out.println("Привет, " + name + "!");

    }
    //8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void workEight(int year) {
        System.out.println("Задание №8");
        if ((year % 4== 0) || (year % 100 != 0) && (year % 400 == 0))
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " не високосный");

    }
}
