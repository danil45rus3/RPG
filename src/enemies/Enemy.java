package enemies;

import heroes.Hero;
import mortal.Mortal;


public abstract class Enemy implements Mortal {
    private final String name;
    private int health;
    private static final int DAMAGE = 10;

    public Enemy(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        this.setHealth(this.getHealth() - damage);
        if (this.health < 0) this.setHealth(0);
    }

    public void attackHero(Hero hero) {
        System.out.printf("%s атаковал героя %s!\n", this.getName(), hero.getName());
        hero.takeDamage(DAMAGE);
        attackInformation(hero);
    }

    public void attackInformation(Hero hero) {
        if (hero.isAlive()) {
            System.out.printf("У %s осталось %d ХП\n", hero.getName(), hero.getHealth());
        } else {
            System.out.printf("%s убит(а)\n", hero.getName());
        }
    }

    @Override
    public boolean isAlive() {
        return this.getHealth() > 0;
    }
}
