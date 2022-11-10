package zad2_9;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }

    /**
     * Вторая строка префикс первой строки?
     *
     * @param str1 Первая строка
     * @param str2 Вторая строка
     * @return true, если вторая строка - префикс первой строки
     */
    public static boolean isPrefix(String str1, String str2) {
        // Если одна из строк пустая, то выход
        if (str1.length() == 0 || str2.length() == 0) {
            return false;
        }

        // Если вторая строка не заканчивается тире, то выход
        if (str2.charAt(str2.length() - 1) != '-') {
            return false;
        }

        // Если первая строка меньше второй, то выход
        if (str1.length() < str2.length()) {
            return false;
        }

        // Цикл с начала второй строки
        for (int i = 0; i < str2.length() - 2; ++i) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // Вторая строка - не префикс первой строки
        return true;
    }

    /**
     * Вторая строка суффикс первой строки?
     *
     * @param str1 Первая строка
     * @param str2 Вторая строка
     * @return true, если вторая строка - суффикс первой строки
     */
    public static boolean isSuffix(String str1, String str2) {
        // Если одна из строк пустая, то выход
        if (str1.length() == 0 || str2.length() == 0) {
            return false;
        }

        // Если вторая строка не начивается с тире, то выход
        if (str2.charAt(0) != '-') {
            return false;
        }

        // Если первая строка меньше второй, то выход
        if (str1.length() < str2.length()) {
            return false;
        }

        // Цикл с конца второй строки
        for (int i = 0; i < str2.length() - 2; ++i) {
            if (str1.charAt(str1.length() - i - 1) != str2.charAt(str2.length() - i - 1)) {
                return false;
            }
        }

        // Вторая строка - не суффикс первой строки
        return true;
    }
}
