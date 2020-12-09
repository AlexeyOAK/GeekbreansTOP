package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        workOne();
        workTwo();
        workThree();
        workFour();
        workFive();

        int [] mass = new int[]{2,1,1,2,3,4,5};
        System.out.println(workSix (mass));
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void workOne() {
        System.out.println("Задание № 1");
        int [] mass = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
                mass[i] = 1;
            } else {
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }
    }
    //2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void workTwo () {
        System.out.println("\n" + "Задание № 2");
        int [] mass = new int[8];
        int x = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = x;
            x +=3;
            System.out.print(mass[i] + " ");
        }
    }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    //пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void workThree () {
        System.out.println("\n" + "Задание № 3");
        int [] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if ( mass[i] < 6) {
                mass[i] = mass[i] * 2;
            }
            System.out.print(mass[i] + " ");
        }
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static void workFour () {
        System.out.println("\n" + "Задание № 4");
        int[][] mass = new int[5][5];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0, j2 = mass[i].length; j < mass[i].length; j++, j2--) {
                if (i == j || i == (j2-1)) {
                    mass[i][j] = 1;
                }
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //5. ** Задать одномерный массив и найти в нем минимальный
    // и максимальный элементы (без помощи интернета);
    static void workFive () {
        System.out.println("Задание № 5");
        int [] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = mass[0];
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            } else if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

    }
    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и
    // правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    static boolean workSix (int [] mass) {
        System.out.println("Задание № 6");

        for (int i = 0; i < mass.length; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < i+1; j++) {
                sum1 = sum1 + mass[j];
            }
            for (int j = i+1; j < mass.length; j++) {
                sum2 = sum2 + mass[j];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }
    //7. **** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
}