package com.ifmo.jjd.lesson7;

public class Knight extends BattleUnit {
    private  int additionalAttack = 10;

    public  Knight(int healthScore, int attackScore){
        super(healthScore,attackScore);
    }

    @Override
    public void rest() {
        plusHeath(2);
    }
}