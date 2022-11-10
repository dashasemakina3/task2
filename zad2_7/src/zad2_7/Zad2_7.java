package zad2_7;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }
    
    /**
     * Является ли строка индексом
     * @param str Строка
     * @return true, если строка-индекс
     */
    public static boolean isValid(String str) {
        
        // Если длина строки не равна 5, то выход
        if(str.length() != 5) return false;
        
        // Цикл, по строке         
        for (int i = 0; i < str.length(); ++i) {
            // Если встретили не цифру, то выход
            if(str.charAt(i) <'0' || str.charAt(i) >'9')
                return false;
        }
        
        // Несоответствий не обнаружено
        return true;
    }
}
