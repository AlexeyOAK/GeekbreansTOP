package lvl2lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] result = {{"1", "3","4","1"}, {"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"4", "4", "4", "4"}};
        try {
            try {
                int wer = test(result);
                System.out.println(wer);
            }
            catch (MyArraySizeException e) {
                System.out.println("Разсер массива не верен");


            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке " + e.i + "_" + e.j);

        }

    }

    public static int test(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        int summ = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException(" Ошибка в количестве строк");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException(" Ошибка в количестве символов в строке");
            }
            for(int j =0; j < arr[i].length; j ++){
                try {
                    summ += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }

        }
        return summ;
    }
}
