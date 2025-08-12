package org.example;

public class GameCharacter {
    protected int health = 100;
    protected int damage;

    public GameCharacter(int initialHealth) {
        this.health = initialHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;
        damage = amount;
    }
}
