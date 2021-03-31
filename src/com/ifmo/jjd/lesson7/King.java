package com.ifmo.jjd.lesson7;

//статический импорт

//import static com.ifmo.jjd.lesson7.Settings.GOLD_COUNT;

import com.ifmo.jjd.lesson7.utils.Randoms;

import static com.ifmo.jjd.lesson7.Settings.*;

final public class King extends Unit {
    private int gold = GOLD_COUNT;
    private BattleUnit[] army; // если массив

    public King() {
        super(KING_HEALTH);
        generateArmy();
    }

    // стоимость армии 200
    private void generateArmy() {
        army = new BattleUnit[ARMY_COUNT];
        if (gold < ARMY_PRICE) return;
        for (int a = 0; a < ARMY_COUNT; a++) {
            army[a] = BattleUnit.getBattleUnit();

        }
        minusGold(ARMY_PRICE);


    }

    //стоимость каждого юнита 20
    public void addUnits() {
        for (int i = 0; i < army.length; i++) {
            if (army[i].isAlive()) continue;
            if ((gold - UNIT_PRICE) < 0) return;
            army[i] = BattleUnit.getBattleUnit();
            minusGold(UNIT_PRICE);
        }
    }

    public void startBattle(King enemy) {
        //рандомный юнит армии короля атакует рандомного юнита противника
        // рандомный юнит армии армии врага атакует рандомного юнита из армии короля
        // после атаки у юнитов вызывается метод rest()
        //Юниты  с 0 здоровьем не должны атаковать
        // юнитов  с 0 здоровьем нельзя атаковать

        for (int i = 0; i < army.length; i++) {
            int thisIndex = Randoms.getRandimInt(army.length);
            int enemyIndex = Randoms.getRandimInt(army.length);
            if (!army[thisIndex].isAlive() || !enemy.army[enemyIndex].isAlive()) continue;
            army[thisIndex].attack(enemy.army[enemyIndex]);
            army[thisIndex].rest();
            if (!enemy.army[enemyIndex].isAlive()) continue;
            enemy.army[enemyIndex].attack(army[thisIndex]);
            enemy.army[enemyIndex].rest();
            

        }
    }


    public boolean hasGold() {
        return gold > 0;
    }


    private void plusGold(int count) {
        gold += count;
    }

    private void minusGold(int count) {
        if (!hasGold()) return;
        gold -= count;
    }

    @Override
    public void rest() {
        minusGold(50);
        plusHeath(10);
    }
}
