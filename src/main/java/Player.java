import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;
    public int hp;
    public int maxHp;
    public List<String> inventory;

    // public no-arg constructor (so `new Player()` works)
    public Player() {
        this.name = "Backstage Dancer";
        this.maxHp = 30;
        this.hp = this.maxHp;
        this.inventory = new ArrayList<>();
        // starter item
        this.inventory.add("Bandage");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
        if (hp < 0) hp = 0;
    }

    public void heal(int amount) {
        hp += amount;
        if (hp > maxHp) hp = maxHp;
    }

    public String inventorySummary() {
        if (inventory.isEmpty()) return "empty";
        return String.join(", ", inventory);
    }
}
