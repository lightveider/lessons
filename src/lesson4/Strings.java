package lesson4;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //char  16 bit -  хранит один символ unicode
        // от 0 до 65536 либо escape  последовательность  от '\u0000' до  '\uffff'

        char char1 = 'J'; // задается в одинарных ковычках
        char char2 = 74; // как номер символа, только положительное значение
        char char3 = '\u0044'; // 16-ричное представление escape последовательности
        System.out.println(char1); //J
        System.out.println(char2); // J
        System.out.println(char3); // D

        //java.lang.String
        //строки задаются либо в двойных кавычках : "строка",
        // либо с использованием одного из контструкторов
        // u оператора new: new String()  !! данным способом пользоваться только если созданием через "" невозможно

        //созднание строки из char
        char[] jjdchars = {'\u004a', '\u004a', '\u0044' };
        String jjdString = new String(jjdchars);
        System.out.println(jjdString); //JJD
        jjdString = "\\u004a', '\\u004a', '\\u0044";
        jjdString = "JJD";

        // размер строки
        System.out.println(jjdString.length()); //3
        System.out.println(jjdString.codePoints().count());//3


        char[] frogChars = {'\uD83D', '\uDC38' }; //🐸
        String frogString = new String(frogChars);
        System.out.println(frogString);
        System.out.println(frogString.length());// 🐸 - длинна 2
        System.out.println(frogString.codePoints().count());//1


        //Пул строк
        String course1 = "Java";
        String course2 = "Java";
        String course3 = new String("Java");
        //сравнение ссылок
        System.out.println(course1 == course2); //true
        System.out.println(course1 == course3); //false
        // строки в языке не изменны можно создать только новую строку на основе существующей


        // сравнение строк
        course1 = "Java junior developer";
        course2 = "Java junior DEVELOPER";


        System.out.println(course1.equals(course2)); // equals вовзращает true/ false чувствителен к регистру
        System.out.println(course1.equalsIgnoreCase(course2)); // сравнивает без учета регистра, сравниваются длины и потом уже значения
        System.out.println(course1.compareTo(course2)); // 32 = 101(номер символа е маленькое) - 69 ( номер символа Е большое)
        System.out.println(course1.compareToIgnoreCase(course2)); // 0

        String userData = null;
        String exit = "exit";
        // userData = "exit";
        //ошибка времени выполнения java.lang.NullPointerException
        //System.out.println(userData.equals("exit"));  // ошибка
        System.out.println(exit.equals(userData)); // рекомендуется такое сравнение строк


        // вычисление строки во время компиляции
        String name1 = "строки в Java";
        String name2 = "строки" + " " + "в" + " " + "Java"; // получили строку "строки в Java"  то же самое что и строка выше
        System.out.println(name1 == name2);// true

        //вычисление в момент выполнения
        name1 = "строки";
        name2 = " в Java";
        System.out.println(name1 + name2 == name1 + name2); // строки вычисляются во время выполнения здесь будет происходить создание новых объектов
        //создаюстя два разных объекта

        String start = "start";
        for (int i = 0; i < 4; i++) { // так нельзя
            start += " " + i;
        }
        System.out.println(start);

        //StringBuilder  работает быстрее, для однопоточных программ
        //StringBuffer   нужно использвоать если несколько параллельных потоков обращаются к одному и тому же StringBuilder  для многопоточных программ


        StringBuilder sb = new StringBuilder("Start");
        sb.append(name1).append(name2);
        String res = sb.toString(); // создание объекта типа java.lang.String
        System.out.println(res);

        sb = new StringBuilder("Start");
        for (int i = 0; i < 4; i++) {
            sb.append(" ").append(i);

        }
        res = sb.toString();
        System.out.println(start);

        String[] animals = {"кот", "пес", "мышь"};
        // создать новый массив, размер которого будет в два раза боьше чем у animals в цикле заполнить массив рандомными значениями из массива animals
        String[] doubleAnimals = new String[animals.length * 2];

        for (int i = 0; i < doubleAnimals.length; i++) {
            doubleAnimals[i] = animals[(int) (Math.random() * animals.length)];
        }
        System.out.println(Arrays.toString(doubleAnimals));

        // методы для того чтобы убрать пробелы: начало, конец строки
        // trim возвращает новую строку без пробелов
        // trim() убирает пространство меньшее или равно u0020 только по кроям строки

        String someStr = " строка ";
        someStr = someStr.trim();


        //Java11: убирает любое пространство
        //strip() - с двух сторон убирают пробелы любой длины
        //stripLeading() - с начала строки
        //stripTrailing() - с конца строки

        //Получить массив символов из строки
        char[] formStr = someStr.toCharArray();
        System.out.println(Arrays.toString(formStr));

        String names = "Java, Kotlin, Python";
        String[] namesArr = names.split(", "); // разделяет строку  по разделителю в скобках
        System.out.println(Arrays.toString(namesArr));

        names = String.join("!", namesArr); // передаём разделитель и массив
        // names = String.join("! ", "строка", "строка")
        System.out.println(names);
        

    }
}

