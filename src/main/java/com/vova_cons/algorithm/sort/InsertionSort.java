package com.vova_cons.algorithm.sort;

/**
 * Сортировка вставками
 * Сложность алгоритма: O(n^2)
 * Потребление памяти: O(0)
 * + Стабильная сортировка
 * + Довольно прост в реализации
 * - Работает быстрее сортировки выбором, но все равно довольно медленный
 */
public class InsertionSort implements Sorter {
    @Override
    public void sort(int[] array) {
        int tmp;
        for(int current = 1; current < array.length; current++)
            for(int j = 0; j < current; j++){ //ищем место для вставки
                if (array[j] > array[current]){ // если нашли такое место
                    tmp = array[current];
                    System.arraycopy(array, j, array, j + 1, current - j);
                    array[j] = tmp; // вставляем элемент на требуемое место
                    break;
                }
            }
    }

}
/**
 *  Это алгоритм сортировки, в котором элементы входной последовательности просматриваются по одному,
 *  и каждый новый поступивший элемент размещается в подходящее место среди ранее упорядоченных элементов.
 */