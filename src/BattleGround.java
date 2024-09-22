
import Enemies.Pudge;
import Heroes.Archer;

public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Bob", 100);
        Pudge enemy = new Pudge("Zloy", 100);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
        archer.attackEnemy(enemy);
    }
}
