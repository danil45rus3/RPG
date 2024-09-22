import enemies.Pudge;
import enemies.Zombie;
import heroes.Archer;
import heroes.Hero;
import heroes.Mage;
import heroes.Warrior;

public class TrainingGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Лучник", 100);
        System.out.println("Началась схватка между Лучником, Пуджом и Зомби!");
        fight(archer);
        Mage mage = new Mage("Маг", 100);
        System.out.println("Началась схватка между Магом, Пуджом и Зомби!");
        fight(mage);
        Warrior warrior = new Warrior("Войн", 100);
        System.out.println("Началась схватка между Войном, Пуджом и Зомби!");
        fight(warrior);
    }

    private static void fight(Hero hero) {
        Zombie zombie = new Zombie("Зомби", 100);
        Pudge pudge = new Pudge("Пудж", 150);
        while (true) {
            if (!zombie.isAlive() && !pudge.isAlive() || !hero.isAlive()) break;
            if (zombie.isAlive()) {
                hero.attackEnemy(zombie);
            } else if (pudge.isAlive()) {
                hero.attackEnemy(pudge);
            }
            if (zombie.isAlive()) zombie.attackHero(hero);
            if (!hero.isAlive()) break;
            if (pudge.isAlive()) pudge.attackHero(hero);
            if (!hero.isAlive()) break;
        }
    }
}
