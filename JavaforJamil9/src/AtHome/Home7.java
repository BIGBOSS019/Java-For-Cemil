package AtHome;

public class Home7 {
    public static void main(String[] args) {


        // 1. int -> byte
        int a = 200;
        byte b = (byte) a;
        System.out.println("int 200 -> byte: " + b); // -56, потому что byte [-128;127]

        // 2. double -> int
        double d = 15.75;
        int dInt = (int) d;
        System.out.println("double 15.75 -> int: " + dInt);
        // дробная часть (0.75) отбрасывается, остаётся только целая часть 15

        // 3. byte + short -> int
        byte x = 50;
        short y = 60;
        int sum = x + y; // результат хранится в int (по правилам Java)
        System.out.println("byte 50 + short 60 -> int: " + sum);

        // Попробуем сохранить в byte
        // byte wrong = x + y; // Ошибка компиляции: нужно явное приведение
        byte sumByte = (byte) (x + y); // если явно привести
        System.out.println("Сумма в byte: " + sumByte);

        // 4. long -> float и double
        long l = 100000;
        float lFloat = l;
        double lDouble = l;
        System.out.println("long 100000 -> float: " + lFloat);
        System.out.println("long 100000 -> double: " + lDouble);
        // Число не изменилось (но у float ограниченная точность при очень больших значениях)

        // 5. Мини-программа магазина
        double price = 19.99;
        int quantity = 3;
        double total = price * quantity;
        System.out.println("Общая стоимость (double): " + total);

        int totalInt = (int) total; // отбрасываем копейки
        System.out.println("Общая стоимость (int): " + totalInt);

        // 6. Исследование с byte
        int[] numbers = {128, 258, 1024};
        for (int num : numbers) {
            byte bb = (byte) num;
            System.out.println(num + " -> byte: " + bb);
        }


        /*\
        Объяснение:
        - byte хранит значения от -128 до 127 (256 разных чисел).
        - При преобразовании идёт "остаток от деления на 256", затем сдвиг в диапазон [-128;127].

        128









    }

         */
    }}