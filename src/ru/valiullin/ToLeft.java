package ru.valiullin;

import java.util.Random;

public class ToLeft {

    private static int[][] arrSort;
    private static int sizeToLeft;

    private static void setArrSort(int[][] arrSort) {
        ToLeft.arrSort = arrSort;
    }
    /**
     * 111
     * util method to generate random int value
     * @param between - take int value
     * @return - return random int value between 0 (inclusive) - between
     */
    private static int random(int between) {
        Random random = new Random();
        return random.nextInt(between);
    }
    /**
     * util method, fill elements in created array
     *
     */
    private static void createArray(int size) {

        setArrSort(new int[size][size]);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrSort[i][j] = random(10);
            }
        }
    }

    //TODO Task 1

    public static void toLeft() {
        sizeToLeft = 10;
        createArray(sizeToLeft);
        //todo 1.Пройти с 1-ой до последней строки
        System.out.println("====================");
        System.out.println("с 1-й до предпоследней строки ");
        System.out.println("====================");
        for (int i = 0; i < sizeToLeft; i++) {          // Цикл по первой размерности выводит строки
            for (int j = 0; j < sizeToLeft; j++) {      // Цикл по второй размерности выводит колонки - вывод одной строки
                System.out.print(arrSort[i][j] + " ");
            }
            System.out.println();
        }

        //todo 2.Пройти с 1-го до предпоследнего элемента
        System.out.println("====================");
        System.out.println("с 1-го до предпоследнего элемента ");
        System.out.println("====================");
        for (int i = 0; i < sizeToLeft; i++) {
            int temp;
            for (int j = 0; j < sizeToLeft-1; j++) {
                //todo 5. В текущую ячейку поместить значение следующей
                temp = arrSort[i][j+1];
                arrSort[i][j] = temp;
                System.out.print(arrSort[i][j] + " ");
            }
            arrSort[i][sizeToLeft-1] = 0;
            System.out.print(arrSort[i][sizeToLeft-1] + " ");
            System.out.print("|");
        }
        System.out.println();
    }
}
