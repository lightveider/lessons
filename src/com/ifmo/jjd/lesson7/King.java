package com.ifmo.jjd.lesson7;

public class King extends  Unit{
    private int gold = 600;
    private  BattleUnit [] army; // если массив

    public King(int healthScore) {
        super(healthScore);
    }
    public boolean hasGold(){
        return  gold >0;
    }


    private  void plusGold(int count){
        gold += count;
    }
    private  void minusGold(int count){
        if (!hasGold()) return;
        gold -= count;
    }

    @Override
    public void rest() {
        minusGold(50);
        plusHeath(10);
    }
}
