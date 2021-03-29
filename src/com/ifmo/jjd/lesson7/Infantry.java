package com.ifmo.jjd.lesson7;

public class Infantry extends BattleUnit {

    private int additionalHealth = 7;


    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    @Override
    public void rest() {
        plusHeath(1);
    }
}
