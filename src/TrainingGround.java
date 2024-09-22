import Enemies.Zombie;
import Heroes.Archer;

public class TrainingGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Лучник",100);
        Zombie zombie = new Zombie("Зомби",100);
        System.out.println("Началась схватка между Лучником и Зомби!");
        while (true){
            archer.attackEnemy(zombie);
            if (!zombie.isAlive()) break;
            zombie.attackHero(archer);
            if (!archer.isAlive()) break;
        }
    }
}
