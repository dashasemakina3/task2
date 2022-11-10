package zad2_10;

/**
 *Работа выполнена Семакиной Дарьей УБСТ2102
 */
public class Zad2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(hexLattice(1));
        System.out.println(hexLattice(7));
        System.out.println(hexLattice(13));
        System.out.println(hexLattice(19));
        System.out.println(hexLattice(25));
        System.out.println(hexLattice(31));
        System.out.println(hexLattice(37));
        System.out.println(hexLattice(43));
        System.out.println(hexLattice(49));
    }

    public static String hexLattice(int n) {

        System.out.print("n=" + n+" ");
        
        // Остаток от деления на 6 должен быть равен 1
        if (n % 6 != 1) {
            return "Invalid";
        }        
        
        // Единица подходит
        if (n == 1) {
            return "\no";
        }
        String str = "\n";

        // Сумма точек
        int sum = 1;
        
        // Длина стороны шеитугольника
        int i;
        
        // Вычисление числовой последовательности
        // Гексагональной решетки
        for (i = 1; sum < n; i++) {
            sum += 6 * i;
        }
        
        // Если количество точек соответствует заданному n,
        // то по заданному n можно построить Гексагональную решетку
        if (sum == n) {
            //System.out.println("Valid side=" + i);
            // Длина стороны решетки
            int side = i;

            // Построение решетки
            // Построение верхней части до середины
            for (int j = 0; j < side; j++) {
                // Добавить пробелы для красоты
                for (int m = 0; m < (side * 2 - 1)-i; ++m) {
                    str += " ";
                }
                // Добавить точки
                for (int k = 0; k < i; ++k) {
                    str += " o";
                }                
                // Переход к новой строке
                str += "\n";
                
                // Увеличить длину ряда
                i++;
            }
            
            // Построение верхней части от середины
            i -= 2;
            for (int j = 0; j < side - 1; j++) {
                // Добавить пробелы для красоты
                for (int m = 0; m < (side * 2 - 1)-i; ++m) {
                    str += " ";
                }
                // Добавить точки
                for (int k = 0; k < i; ++k) {
                    str += " o";
                }
                // Переход к новой строке
                str += "\n";
                
                // Уменьшить длину ряда
                i--;
            }

            // Вывести результат
            return str;
        }

        // Неверное число
        return "Invalid";
    }
}
