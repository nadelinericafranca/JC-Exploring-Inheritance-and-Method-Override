package org.example;

public class ArmoredCharacter extends GameCharacter {
    public ArmoredCharacter(int health) {
        super(health);
    }

    public void takeDamage(int amount) {
        super.takeDamage(amount/2);
        damage = amount/2;
    }
}
