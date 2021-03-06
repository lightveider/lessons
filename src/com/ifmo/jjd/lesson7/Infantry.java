package com.ifmo.jjd.lesson7;

public class Infantry extends BattleUnit {

    private final int additionalHealth = Settings.ADDITIONAL_HEALTH;


    public Infantry(int healthScore, int attackScore) {
        super(healthScore, attackScore);
    }

    @Override
    public void rest() {
        plusHeath(1);
    }

    @Override
    public void attack(Unit unit) {
        unit.minusHealth(getAttackScore());
        if (!unit.isAlive()) plusHeath(additionalHealth);
    }
}
