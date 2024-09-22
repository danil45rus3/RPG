package heroes;

import enemies.Enemy;

public class Warrior extends Hero {
    private static final int DAMAGE = 15;
    private static final int ABILITY_DAMAGE = 30;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() < 0.5) {
            System.out.printf("%s ударил(а) мечем %s!\n", this.getName(), enemy.getName());
            enemy.takeDamage(DAMAGE);
        } else {
            System.out.printf("%s использовал(а) двойной удар %s!\n", this.getName(), enemy.getName());
            enemy.takeDamage(ABILITY_DAMAGE);
        }
        attackInformation(enemy);
    }
}