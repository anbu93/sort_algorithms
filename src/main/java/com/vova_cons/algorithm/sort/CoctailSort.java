package com.vova_cons.algorithm.sort;

/**
 * Сортировка перемешиванием.
 * Улучшенный вариант сортировки пузырьком
 * Сложность алгоритма: O(n){в лучшем случае} ~ O(n^2) {в худшем случае}
 * Потребление памяти: O(3)
 * + Потребляет мало памяти (почти не потребляет
 * + Довольно простая реализация
 * - Чуть быстрее пузырьковой сортировки, но все еще медленный алгоритм
 */
public class CoctailSort implements Sorter {

    @Override
    public void sort(int[] array) {
        int tmp;
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            for(int i = left; i < right; ++i)
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            right--;
            for(int i = right; i > left; --i)
                if (array[i] < array[i-1]){
                    tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                }
            left++;
        }
    }
}
/**
 * Шаги:
 * 0. Устанавливаем границы
 * 1. Идем внутри границ слева направо, как обычная сортировка (максимальный элемент всплывет к правой границе
 * 2. Уменьшаем правую границу на еденицу (так как максимальный уже отсортирован и его можно пропускать)
 * 3. Идем справа налево, обратной пузырьковой сортировкой (минимальный элемент всплывет на левой границе)
 * 4. Увеличиваем левую границу (так как там минимальный)
 * 5. Повторяем 1-4 пока внутри границ существуют элементы.
 */