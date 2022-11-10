package zad2_8;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
    }
 
    /**
     * Странная пара
     * @param str1 Первая строка
     * @param str2 Вторая строка
     * @return true, если строки - это странная пара
     */
    public static boolean isStrangePair(String str1, String str2) {
        // Если строки пустые
        if(str1.length() == 0){
            if(str2.length()== 0)
                return true;
            else return false;
        }else if(str2.length()== 0)
            return false;
                
        // Если первый символ первой строки равен последнему символу второй строки
        // и последний символ первой строки равен первому символу второй строки
        if(str1.charAt(0) == str2.charAt(str2.length()-1) &&
           str1.charAt(str1.length()-1) == str2.charAt(0)) return true;
        
        // Строки не образуют странную пару
        return false;
    }
}
