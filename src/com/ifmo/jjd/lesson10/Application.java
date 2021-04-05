package com.ifmo.jjd.lesson10;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Article auArticle = new Article("Про Австралию");
        auArticle.setText("Текст статьи");
        auArticle.setCountry(Article.Country.AUSTRALIA);

        Article ukArticle = new Article("Про Великобританию");
        ukArticle.setText("Текст статьи");
        ukArticle.setCountry(Article.Country.UK);

        // Методы enum
        // массив с элементами перечисления
        Article.Country[] countries = Article.Country.values(); //возвращает массив с перечислениями
        System.out.println(Arrays.toString(countries));

        // индекс элемента перечисления
        System.out.println(Article.Country.USA.ordinal());  // 2

        for (Article.Country country : countries) {
            System.out.println(country.ordinal() + " " + country.name());
        }

        Article.Country usa = Article.Country.valueOf("USA");
        System.out.println(usa); // USA value of принмает строчку а возвращает объект указанно типа

        Priority priority = Priority.HIGH;
        priority.setCode(100);
        System.out.println(priority.getCode());

        Priority.MIDDLE.setCode(50);
        System.out.println(Priority.MIDDLE.getCode());
        // [HIGH, MIDDLE, LOW]
        for (Priority elem : Priority.values()) {
            System.out.println(elem.name() + " " + elem.getCode());
        }

        if (priority == Priority.HIGH) {
            System.out.println("срочное сообщение");

        } else if (priority == Priority.LOW) {
            System.out.println("Не очень срочное сообщение");
        }

        Operation sum = Operation.SUM;
        System.out.println(sum.action(5, 5));
        System.out.println(Operation.MULTI.action(5, 5));


    }
}
