package com.ifmo.jjd.lesson10;

import java.time.LocalDateTime;

//enums
public class Article {
    private final String tittle;
    private String text;
    private final LocalDateTime created;
    private Country country;

    public Article(String tittle) {
        this.tittle = tittle;
        created = LocalDateTime.now();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTittle() {
        return tittle;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public enum Country { //extends java.lang.Enum
        AUSTRALIA, UK, USA // каждый элемент перечисления это объект указанного типа
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
