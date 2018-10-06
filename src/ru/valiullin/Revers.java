package ru.valiullin;

import java.util.Arrays;
import java.util.Random;

public class Revers {
    //TODO Revers - сделать отдельный массив и менять метстами первый и последний эелмент,
    // udp. цикл выполняется до sizeToLeft/2

    private int[] arrToRevers;
    private int size = 11;

    public void setArrToRevers(int[] arrToRevers) {
        this.arrToRevers = arrToRevers;
    }

    /**
     * Util method random int gen.
     *
     */
    private int random(int between) {
        Random random = new Random();
        return random.nextInt(between);
    }

    private void createArray(int arrSize) {
        setArrToRevers(new int[arrSize]);
        for (int i = 0; i < arrSize; i++) {
            arrToRevers[i] = random(20);
        }
        System.out.println(Arrays.toString(arrToRevers));
    }
    private void swapArrayElements() {
        int temp;
        int indx = size - 1;
        for (int i = 0; i < size/2; i++) {

            temp = arrToRevers[i];
            arrToRevers[i] = arrToRevers[indx-i];
            arrToRevers[indx-i] = temp;
        }
        System.out.println(Arrays.toString(arrToRevers));
    }

    public void revers() {
        createArray(size);
        swapArrayElements();
    }
}
