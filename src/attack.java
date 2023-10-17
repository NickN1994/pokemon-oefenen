import java.util.ArrayList;
import java.util.List;

public class attack {

    private String attackName;
    private int damage;
    private List<attack> attacks;
//    private static ArrayList<attack> attacks = new ArrayList();

    public attack(String attackName, int damage) {
        this.attackName = attackName;
        this.damage = damage;

//        attack fire1 = new attack("Flamethrower", 70);
//        attack fire2 = new attack("Flame Wheel", 50);
//        attack fire3 = new attack("Fire Blast", 110);
//        attack fire4 = new attack("Slash", 60);


//        attacks.add(fire1);
//        attacks.add(fire2);
//        attacks.add(fire3);
//        attacks.add(fire4);
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

//    public ArrayList<attack> getAttack() {
//        return attacks;
//    }
//
//    public void setAttack(ArrayList<attack> attack) {
//        this.attacks = attack;
//    }


    public List<attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<attack> attacks) {
        this.attacks = attacks;
    }

    public static void printAttack(){
        List<attack> attacks = new ArrayList<>();

        attack fire1 = new attack("Flamethrower", 70);
        attack fire2 = new attack("Flame Wheel", 50);
        attack fire3 = new attack("Fire Blast", 110);
        attack fire4 = new attack("Slash", 60);

        attacks.add(fire1);
        attacks.add(fire2);
        attacks.add(fire3);
        attacks.add(fire4);

            for (attack attack : attacks) {
                System.out.println("Attackname: " + attack.getAttackName() + " Damage: " + attack.getDamage());
                System.out.println(attack.getAttackName());
            }

//            Deze wordt niet geprint omdat de lijst niet wordt opgehaald?
//        System.out.println(attack.getAttackName());
    }
//Overige vragen
// Waarom kan ik de getName uit de Pokemon class niet benoemen hierboven in de for loop
//    omdat de fire class een subclass is van Pokemon (super class)

//    Waarom moet ik in de Main attack.printAttack(); schrijven en waarom kan ik daar niet Charizard.printAttack();

// Wanneer geef je de List mee als parameter en wanneer als argument ?

//    Hoe kan ik een attack uit de lijst uit deze class ophalen in de pokemon of water class bijvoorbeeld
//    met een get.AttackName();

//    Wanneer parameter gebruiken en wanneer als argument
//
}


