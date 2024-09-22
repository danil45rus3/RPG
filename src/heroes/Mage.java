package heroes;

import enemies.Enemy;

public class Mage extends Hero {
    private static final int DAMAGE = 10;
    private static final int ABILITY_DAMAGE = 50;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (Math.random() < 0.5) {
            System.out.printf("%s использовал(а) заклинание атаки по %s!\n", this.getName(), enemy.getName());
            enemy.takeDamage(DAMAGE);
        } else {
            System.out.printf("%s использолал заклинание огненный шар по %s!\n", this.getName(), enemy.getName());
            enemy.takeDamage(ABILITY_DAMAGE);
        }
        attackInformation(enemy);
    }
}
