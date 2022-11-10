package zad2_4;

import java.util.Arrays;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Инициализировать массивы
        int[] m1 = {1, 2, 3};
        int[] m2 = {1, -2, 3};
        int[] m3 = {3, 3, -2, 408, 3, 3};

        System.out.println(Arrays.toString(cumulativeSum(m1)));
        System.out.println(Arrays.toString(cumulativeSum(m2)));
        System.out.println(Arrays.toString(cumulativeSum(m3)));
    }
    
    public static int[] cumulativeSum(int[] mas) {

        // Новый массив
        int[] arr = new int[mas.length];
        
        // Сумма предыдущих элементов массива
        int sum = 0;
        
        // Первый элемент
        arr[0] = mas[0];

        // Цикл по массиву, начиная со второго элемента
        for (int i = 1; i < mas.length; ++i) {
            // Суммирование предыдущих элементов            
            sum+=mas[i-1];
            arr[i] = sum+mas[i];
        }
        
        // Вывод результата
        return arr;
    }
}
