package Heroes;

import Enemies.Enemy;
import Interface.Mortal;

public abstract class Hero implements Mortal {

    private final String name;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);


    public void attackInformation(Enemy enemy) {
        if (enemy.isAlive()) {
            System.out.printf("У %s осталось %d ХП\n", enemy.getName(), enemy.getHealth());
        } else {
            System.out.printf("%s убит(а)", enemy.getName());
        }
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        if (this.health < 0) this.setHealth(0);
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }
}
