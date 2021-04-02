package com.ifmo.jjd.lesson6;

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

    @Override
    public ClimbingGroup clone() {
        Mountain copyM = this.mountain.clone();
        ClimbingGroup copyGr = new ClimbingGroup(copyM, climbers.length);
        copyGr.climbers = climbers.clone();
        return  copyGr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClimbingGroup)) return false;
        ClimbingGroup that = (ClimbingGroup) o;
        return Objects.equals(mountain, that.mountain) && Arrays.equals(climbers, that.climbers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mountain);
        result = 31 * result + Arrays.hashCode(climbers);
        return result;
    }
}
