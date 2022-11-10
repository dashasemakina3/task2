package zad2_3;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Инициализировать массивы
        int[] m1 = {1, 3};
        int[] m2 = {1, 2, 3, 4};
        int[] m3 = {1, 5, 6};
        int[] m4 = {1, 1, 1};
        int[] m5 = {9, 2, 2, 5};

        System.out.println(isAvgWhole(m1));
        System.out.println(isAvgWhole(m2));
        System.out.println(isAvgWhole(m3));
        System.out.println(isAvgWhole(m4));
        System.out.println(isAvgWhole(m5));
    }

    /**
     * Является ли среднее значение всех элементов массива целым числом или нет
     *
     * @param mas Массив
     * @return Результат
     */
    public static boolean isAvgWhole(int[] mas) {

        // Сумма элементов
        int sum = 0;

        // Цикл по массиву
        for (int i = 0; i < mas.length; ++i) {
            // Суммирование элементов
            sum += mas[i];
        }

        // Если остаток от деления sum на количество элементов
        // равен нулю, то среднеарифметическое - целое число
        return (sum % mas.length == 0);
    }
}
