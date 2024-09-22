package Heroes;

import Enemies.Enemy;

public class Archer extends Hero {
    private static final int DAMAGE = 13;
    private static final int ABILITY_DAMAGE = 35;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() < 0.5) {
            System.out.printf("%s выстрелил(а) из лука по %s!\n", this.getName(), enemy.getName());
            enemy.takeDamage(DAMAGE);
        } else {
            System.out.printf("%s использовал(а) выстрел тремя стрелами по %s!\n", this.getName(), enemy.getName());
            enemy.takeDamage(ABILITY_DAMAGE);
        }
        attackInformation(enemy);
    }
}
