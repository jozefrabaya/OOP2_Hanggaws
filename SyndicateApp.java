import java.util.ArrayList;
import java.util.List;

interface Committable {
    void commitOperation(Operation operation);                                      //Sabellano (3 classes)
}

interface WeaponSystem {
    int attack();
}

abstract class GameCharacter {

    private String name;
    private int health;
    private int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    protected int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract int attack();                                                       // Sabellano (3 classes)
}