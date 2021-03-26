package com.ifmo.jjd.lesson6;

import java.util.UUID;

public class Climber {
    // свойства  так же называют полями или атрибутами
    //чтобы перечислить характеристики будующих объектов сначала указываем тип данных этого свойства

    private String fullName;
    private int age;
    private String email;
    private UUID uuid;

    //методы
    // для методов которые не чего не возвращяют начинаем со слова void
    //
    void setFullName(String fullName) {
        if (fullName == null || fullName.trim().length() < 3) {
            throw new IllegalArgumentException("Значение fullName < 3");
        }
        this.fullName = fullName;
    }

    /*package private*/
    void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Значение age должно быть < 18");
        }
        this.age = age; // первый age - ссылка на текущий объект age
    }
    // генерация Setter'a  пкм - генерате - сеттер

    public void setEmail(String email) {
        if (email == null || !email.trim().contains("@")) {
            throw new IllegalArgumentException("Это не email");
        }
        this.email = email;
    }

    public void setUuid() {
        this.uuid = uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return  age;
    }

    public String getEmail() {
        return email;
    }

    public UUID getUuid() {
        return uuid;
    }

    //ALT+ ins ПКМ+ins


    @Override
    public String toString() {
        return "Climber{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
