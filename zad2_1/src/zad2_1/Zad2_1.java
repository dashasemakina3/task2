package zad2_1;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
    }

    /**
     * Изменить строку
     *
     * @param str Строка
     * @param n Количество раз
     * @return Результирующая строка
     */
    public static String repeat(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); ++i) {
            for (int j = 0; j < n; ++j) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
