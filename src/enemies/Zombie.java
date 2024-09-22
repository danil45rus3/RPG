package enemies;

public class Zombie extends Enemy {
    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (!isAlive()) {
            if (Math.random() < 0.5) {
                this.setHealth(100);
                System.out.println("Зомби возродился!");
            }
        }
    }
}
