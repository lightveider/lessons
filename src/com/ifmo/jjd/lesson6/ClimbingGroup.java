package com.ifmo.jjd.lesson6;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;

public class ClimbingGroup {
    private Mountain mountain;
    private Climber[] climbers;


    public ClimbingGroup(Mountain mountain, int climberCount) {
        // Проверка на null + исключение
        this.mountain = Objects.requireNonNull(mountain, "mountain не может быть равно нулю");
        climbers = new Climber[climberCount];

    }

    @Override
    public String toString() {
        return "ClimbingGroup{" +
                "mountain=" + mountain +
                ", climbers=" + Arrays.toString(climbers) +
                '}';
    }

    public void addClimber(Climber climber) {
        Objects.requireNonNull(climber, "climber не может быть null");
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                return; // в void методах используется для заверешния работы метода
            }

        }
        System.out.println("Мест нет");
    }
}
