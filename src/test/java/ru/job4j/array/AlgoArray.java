package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; /* переменна€ дл€ временного хранени€ значение €чейки с индексом 0. */
        array[0] = array[3]; /* записываем в €чейку с индексом 0 значение €чейки с индексом 3. */
        array[3] = temp; /* записываем в €чейку с индексом 3 значение временной переменной. */

        temp = array[1];
        array[1] = array[2];
        array[2] = temp;

        temp = array[3];
        array[3] = array[4];
        array[4] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}