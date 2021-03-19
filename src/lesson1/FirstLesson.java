package lesson1;
//ctrl + alt + l
//Однострочный комментарий
/* ctrl  shift + /
многотрочный
комментарий
 */
//test for git 123123
public class FirstLesson {
    //точка входа psvm
    public static void main(String[] args) {
        //консольный вывод ( sout + enter)
        System.out.println("Консольный вывод");

        //объявление переменных типДанных имяПеременной;
        int count = 98234;
        //объявление переменных одного типа в одну инструкцию
        int length = 123, width = 301, height = 501;

        //объявление переменных без присвоения значения

        int size, page;
        size = 20;
        page = 6;

        //обращение к переменной происходит по её имени

        System.out.println(size);

        //byte data = 500;

        int bill = 1_000_000;
        //для удобства может использовать _ в числах для разграничения

        float pi = 3.14F; //нужно явно указать на float
        //для float надо ставить F вконце числа

        long veryBig = 67_000_000_000L;
        //Для long надо указать L, только при инициализации

        //Деление на ноль
        //Деление чисел приведет к ошибке выполнения: java.lang.ArithmeticException
        //System.out.println(bill/0);

        //чисел с плавающей точкой infinity
        //System.out.println(pi/ 0 );

        //Приведение типов
        double price = bill;
        System.out.println(price);

        byte miniPrice = (byte) bill; // Явное приведение
        System.out.println(miniPrice);


        //операции над byte и short приводят к расширению контейнера до int или использовать явное приведение
        byte a = 12, b = 90;
        byte ab = (byte) (a + b);

        boolean isActive = false;
        boolean closed = true;


        //Операторы

        height = 9;
        width = 2;

        // Взятие остатка от деления
        System.out.println(height % width);

        //конкатенация строк
        System.out.println("System" + "system");

        //присваивание
        height = height * 2; // height *= 2;
        System.out.println(height);

        width -= height;// width = width - height;
        System.out.println(width);

        //Операторы сравнения
        width = 2;
        height = 8;
        boolean res = height != width;
        System.out.println(height != width); // true
        System.out.println(height > width); //true
        System.out.println(height <= width); //false

        //тернарный оператор ?
        //  переменная = логическое выражение/условие ? выражение1 : выражение2;

        double sum = bill > 1000 ? bill - bill * 0.1 : bill;
        System.out.println(sum);

        // || или
        boolean cancelled = false;
        System.out.println(bill > 0 || cancelled); //sout

        // && и
        int start = 3, end = 10;
        System.out.println(start < end && end < 100_000);

        // ! не
        System.out.println(!cancelled); //true
        System.out.println(!(bill > 0 || cancelled)); //false меняет итоговое значение на противоположное

        // ^ исключаеющее или (xor)
        System.out.println(bill > 0 ^ !cancelled); // false

        //инкремент ++ - увеличивает значение переменной на 1
        //декремент -- - уменьшает значение переменной на 1

        height = 2;
         int result = height++ - ++height + height-- - ++height * ++height + --height;

         // 2 - 4 + 4 - 4 * 5 + 4 = -14
         //-- i сначала изменяет значение, потом возвращает её значение
         //i-- сначала возвращает значение переменной, потом изменяет
        System.out.println(result);

    }
}
