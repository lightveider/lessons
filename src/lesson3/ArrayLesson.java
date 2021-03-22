package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        System.out.println("Массивы");

        // объявление переменной массива
        // сначала тип данных  [] имя переменной = new тип данных в массиве
        // Длинну массива можно задавать через переменную
        int len = 10;
        int[] ints = new int[len]; // массив на 10 элементов типа инт заполненный по умолчанию
        int[] ints1 = new int[4];// явное задание длинны массива
        int[] ints2 = new int[len + 2]; // int задание массива

        //задание массива в фигурных скобках с конкретными значениями
        int[] ints3 = {12, 67, -90, 1421, 6032, 0};
        //ints3 ={2,5,7,123}; так нельзя
        //new int [] {123,123,321} - "безымянный массив" нужно для того чтобы переписать ссылку и переменная ссылалась на другой массив
        ints3 = new int[]{89, 12, -9};

        //вывод массива в консоль ( получим хэш код)
        System.out.println(ints3);
        //import java.util.Arrays;
        System.out.println(Arrays.toString(ints3)); //сформирует строку из массива

        // дотуп к элементам массива осуществляется по имени массива через квадратные скобки
        //В квадратных скобках указывается индекс элемента

        int elem = ints3[1];
        System.out.println(elem); // Увидим 12
        // значение элемента можем получать для чтения а также изменять значение элемент массива

        ints3[0] = 13009;// Изменение значения элемента массива
        System.out.println(Arrays.toString(ints3));

        //System.out.println(ints3[10]);
        // обращение к несуществующему элементу массива
        //Приведет к  ошибке java.lang.ArrayIndexOutOfBoundsException выход за пределы массива

        // многомерные массивы - элементами массива являются другие массивы
        int[][] ints4 = new int[3][4]; // new int [3] [4] - размерноть главнного массива( указывает количество массивов внутри)
        //  внутри массивы размером 4  элемента
        // [[0, 0, 0, 0], [0, 0, 90, 0], [0, 0, 0, -4021]]
        // доступ к элементам многомерного массива
        ints4[1][2] = 90;
        ints4[2][3] = -4021;
        // вывод в консоль многомерного массива
        System.out.println(Arrays.deepToString(ints4));

        int[][] ints5 = new int[4][];// При создании многомерного массива должны поставить только размерность главного массива
        // [null, null, null, null]
        ints5[0] = new int[1]; // [[0],null, null, null]
        ints5[1] = new int[2]; // [[0],[0,0],null,null]
        ints5[2] = new int[3]; // [[0],[0,0],[0,0,0],null]
        ints5[3] = new int[4]; // [[0],[0,0],[991,0,0],[0,0,0,0]
        ints5[2][0] = 991;
        System.out.println(Arrays.deepToString(ints5));

        // == не сравниваем
        // ints5[0] == null
        // сравнивать с null можно

        // перебор массивов
        // цикл
        int[] ints6 = {45, 90, 1, -32, 100};

        //Цикл for позволяет изменять значения элементов массива в цикле
        // fori + enter
        // массив.length - длинна массива( размер)
        // length только на чтение( только узнать значение)
        for (int i = 0; i < ints6.length; i++) {
            // в теле цикла можно изменять значения массива
            ints6[i] += 10;

        }
        System.out.println(Arrays.toString(ints6));

        //foreach не имеет доступа к индексам, не позволяет изменить значения элементов массива
        //iter int[] ints6 = {45, 90, 1, -32, 100}
        for (int arrElem : ints6) {
            System.out.println(arrElem);
            //  arrElem *=arrElem;
        }
        // объявить массив типа double на 7 элементов,
        // заполнить его в цикле рандомными значениями (3,100)
        // найти минимальное значение в массиве
        //Math.random()* 97 + 3
        double min = Double.MIN_VALUE;
        double max = Double.MAX_VALUE;
        double[] doubles = new double[7];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.random() * 97 + 3;
            if (doubles[i] < max) max = doubles[i];
        }
        System.out.println(Arrays.toString(doubles));
        System.out.println(max);

        int[] ints7 = {90, 12, 67, -100, 56, 32};
        //найти сумму значений элементов массива
        int summ = 0;
        for (int i = 0; i < ints7.length; i++) {
            summ += ints7[i];
        }
        System.out.println(summ);
        for (int i = 0; i < ints7.length; i++) {
            if (ints7[i] > 12 && ints7[i] < 60) ints7[i] = 0;

        }

        //Arrays.binarySearch(ints, 23);

        // сравнение массивов
        int[] a = {34, 78, 10};
        int[] b = {34, 78, 10};
        System.out.println(a == b); //false не подходит для массивов
        System.out.println(a.equals(b)); //false не подходит для массивов
        System.out.println(Arrays.equals(a, b)); // true

        //сортировка массива
        // алгорит быстрой сортировки

        Arrays.sort(a);// сортировка массива по возрастани.
        //Arrays.parallelSort(a);  сортировка большого массива , оправдано только при применение огромных массивов
        System.out.println(Arrays.toString(a));

        //Копирование массивов
        a = new int[]{34, 90, -1};
        int[] newInt = a; //создание дополнительной ссылки

        int[] clonerArr = a.clone(); // создание полной копии массива

        int[] copyArr = new int[10];
        //a = {34, 90, -1};
        // copyArr {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,}
        // Массив из_которого осущестявляется, int srPos (ставится число номер элемента массива),
        // Массив в_который  добавляем, с какого элемента начинается заполнение массива
        //lenght длина массива

        System.arraycopy(a,1,copyArr, 4,2); //самый гибкий метод по копированию массивов
        System.out.println(Arrays.toString(copyArr));

        //Arrays.copyOf();

        a = new int []{34, 90, -1, 200, -12};
        // метод бинарного поиска  для метода массив должен быть отсортирован
        Arrays.sort(a);
        int res = Arrays.binarySearch(a, -1);
        System.out.println(res);
        res = Arrays.binarySearch(a, 35 ); //-4 : 3  если число отрицательное значит элемента в массиве не найдено
        System.out.println(res);

        //binarySearch(int[] a, int key)

    }


}

