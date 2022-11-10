package zad2_5;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
        System.out.println(getDecimalPlaces("31."));
    }
 
    /**
     * Количество знаков после точки в числе
     * @param str Число
     * @return Количество знаков после точки в числе
     */
    public static int getDecimalPlaces(String str) {
        
        // Цикл, по строке         
        for (int i = 0; i < str.length(); ++i) {
            // Если встретили точку
            if(str.charAt(i) == '.')
                // Вернуть разницу между длиной строки и текущим номером
                // минус один,
                // точка - это тоже элемент
                return str.length()-i-1;
        }
        
        // Точки не обнаружено
        return 0;
    }
}
