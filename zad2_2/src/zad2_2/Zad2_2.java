package zad2_2;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Инициализировать массивы
        int[] m1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] m2 = {44, 32, 86, 19};

        System.out.println(differenceMaxMin(m1));
        System.out.println(differenceMaxMin(m2));
    }

    /**
     * Возвращает разницу между самыми большими и самыми маленькими числами
     *
     * @param mas Массив
     * @return Результат
     */
    public static int differenceMaxMin(int[] mas) {

        // Максимальный и минимальный элементы
        int max, min;

        // Начальное значение первого элемента
        max = min = mas[0];

        // Цикл по массиву, начиная со второго элемента
        for (int i = 1; i < mas.length; ++i) {

            // Если элемент больше максимального
            if (mas[i] > max) {
                // Запомнить его
                max = mas[i];
            }

            // Если элемент меньше минимального
            if (mas[i] < min) {

                // Запомнить его
                min = mas[i];
            }
        }

        // Вывод разницы
        return max - min;
    }
}
