package com.vova_cons.algorithm.sort;

/**
 * Сортировка выбором
 * Сложность алгоритма: O(n^2)
 * Потребление памяти: O(2)
 * + простой в реализации
 * + не расходует память
 * - медленный
 * - нестабильный
 */
public class SelectionSort implements Sorter {

    @Override
    public void sort(int[] array){
        int min, tmp;
        for(int i = 0; i < array.length-1; ++i){
            min = i;
            for(int j = i+1; j < array.length; ++j)
                if (array[j] < array[min])
                    min = j;
            if (min != i) {
                tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }
}
/**
 * Шаги алгоритма:
 * 1. Ищем от i до конца минимальное значение
 * 2. Если это не i-ый элемент, то меняем местами минимальный и i-ый элемент
 * 3. Увеличивем i на еденицу, и продолжаем алгоритм
 * 4. При достижении i до length-1 заканчиваем работу алгоритма.
 */