package zad2_6;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));
    }

    /**
     * Получить число Фибоначчи
     *
     * @param n Число
     * @return число Фибоначчи
     */
    public static int Fibonacci(int n) {

        // последние два числа Фибоначчи
        int a = 1;
        int b = 1;
        
        // Цикл, пока не достигнем n
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }

        // Результат
        return b;
    }
}
