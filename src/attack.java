import java.util.ArrayList;

public class attack {

    private String attackName;
    private int damage;
    private static ArrayList<attack> attacks = new ArrayList();

    public attack(String attackName, int damage) {
        this.attackName = attackName;
        this.damage = damage;

        attack fire1 = new attack("Flamethrower", 70);
        attack fire2 = new attack("Flame Wheel", 50);
        attack fire3 = new attack("Fire Blast", 110);
        attack fire4 = new attack("Slash", 60);


        attacks.add(fire1);
        attacks.add(fire2);
        attacks.add(fire3);
        attacks.add(fire4);
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public ArrayList<attack> getAttack() {
        return attacks;
    }

    public void setAttack(ArrayList<attack> attack) {
        this.attacks = attack;
    }



    public void printAttack(ArrayList<attack> attacks){
            for (attack attack : attacks) {
                System.out.println("Attackname" + attack.getAttackName() + "Damage" + attack.getDamage());
            }
    }

}


