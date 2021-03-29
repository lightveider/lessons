package com.ifmo.jjd.lesson7;

abstract public class Unit implements RestAble{
    protected int healthScore;
    protected int maxHealthScore;


    public Unit(int healthScore) {
        this.healthScore = healthScore;
        maxHealthScore = healthScore;
    }

    public boolean isAlive() {
        return healthScore > 0;
    }

    //увеличивает значение healthScore на count но не больше maxHealthScore
    public void plusHeath(int count) {
        healthScore = Math.min(healthScore + count, maxHealthScore);
        if (!isAlive()) return;
    /*    healthScore += count;

        if (healthScore >= maxHealthScore) {
            healthScore = maxHealthScore;
        }
    */

    }

    //уменьшает значение healthScore на count
    public void minusHealth(int count) {
        if (!isAlive()) return;
        healthScore -= count;


    }

}
