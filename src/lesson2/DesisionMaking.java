package lesson2;

import java.util.Scanner; //alt + enter на имени класса для импорта

public class DesisionMaking {
    //psvm
    public static void main(String[] args) {
        //консольный ввод
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер");
        int userNum = in.nextInt();
        System.out.println(userNum);


        //if
        int state = 0;

        if (state == 0) {
            System.out.println("Закрытие приложения"); // в инструкциях может быть еще ветвление
        } else if (state == 1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка статуса");
        }

        /*
         * Даны переменные age и exp
         * если значение переменной age больше 100
         * вывести "Мы вам перезвоним"
         * в противном случае перейти к проверке exp
         * если exp меньше 5, вывести  "Вы подходите на должность стажера
         * в противном случае вывести "Вы подходите на должность разработчика"
         * добавить проверки*/
        Scanner age = new Scanner(System.in);
        System.out.println("Введите возраст");
        int ageInfo = in.nextInt();
        Scanner exp = new Scanner(System.in);
        System.out.println("Введите опыт");
        int expInfo = in.nextInt();
        if (ageInfo > 100) {
            System.out.println("Мы вам перезвоним");
        } else if (ageInfo < 0) {
            System.out.println("Вы нам не подходите");
        } else if (expInfo >= ageInfo) {
            System.out.println("Вы нам не подходите");
        } else {
            if (expInfo < 5) {
                System.out.println("Вы подходите на должность стажера");
            } else {
                System.out.println("Вы подходите на должность разработчика");
            }
        }

        //Работа switch
        int sum = 1000, code = 5984;
        // 4692 - 30%
        // 7024,5984 - 20%
        //1235,7351,9835 - 10%
        switch (code) {
            case 4692:  //в кейс не используются переменные
                System.out.println(sum - sum * 0.3);
                break;
            case 7024:
            case 5984:
                System.out.println(sum - sum * 0.2);
                break;
            case 1235:
            case 7351:
            case 9835:
                System.out.println(sum - sum * 0.1);
                break;
            default:
                System.out.println(sum);
        }
        /*дан номер месяца, в зависимости от номера месяца
         * вывести время года
         */

        Scanner seasonInfo = new Scanner(System.in);
        byte season = in.nextByte();
        System.out.println("Введите месяц чтобы узнать сезон");
        switch (season) { //alt + enter альтернативный вид switch
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");


        }

        //пользователь вводит целое число с клавиатуры
        // необходимо вывести это число увеличенное на 2
        // если пользователь ввел 0,  цикл прерывает работу

        while (true) {
            System.out.println("Введите число");
            int num = in.nextInt();
            System.out.println(num + 2);
            if (num == 0) break;

        }
        int start = 1, end = 14;

        while (start <= end) {
            if (start % 2 == 0) System.out.println(start);
            start++;
        }


       /* for (инициализация счетчиков;условие; обновление счетчиков) {
            тело цикла


        }*/
        //вывести все положительные элементы последовательности
        for (int num = 95; num > 0; num -= 5) {
            System.out.println(num);
        }

        //вывести на экран первые 20 элементов последовательности
        //2 4 6 8 10
        for (int num = 2, counter = 1; counter <= 20; num += 2, counter++) {
            System.out.println(num);

        }
    }
}
