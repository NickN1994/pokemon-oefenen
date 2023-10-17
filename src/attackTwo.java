import java.util.ArrayList;
import java.util.List;

public class attackTwo {

    private String attackName;
    private int damage;

//    private List<attackTwo> waterAttackList;
    private List<attack> attacks;

    public attackTwo(String attackName, int damage) {
        this.attackName = attackName;
        this.damage = damage;
    }

    public String getAttack() {
        return attackName;
    }

    public void setAttack(String attackName) {
        this.attackName = attackName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

//    public List<attackTwo> getWaterAttackList() {
//        return waterAttackList;
//    }
//
//    public void setWaterAttackList(List<attackTwo> waterAttackList) {
//        this.waterAttackList = waterAttackList;
//    }

    public List<attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<attack> attacks) {
        this.attacks = attacks;
    }



//    public static void printAttackWater(){
//        List<attackTwo> waterAttackList = new ArrayList<>();
//
//        attacktwo water1 = new attackTwo("Surf", 70);
//        attacktwo water2 = new attackTwo("Hydro Pump", 110);
//        attacktwo water3 = new attackTwo("Water gun", 40);
//        attacktwo water4 = new attackTwo("Blizzard", 100);
//
//        waterAttackList.add(water1);
//        waterAttackList.add(water2);
//        waterAttackList.add(water3);
//        waterAttackList.add(water4);
//
//    }

    public static void printAttackWater() {
        List<attack> attacks = new ArrayList<>();

        attack water1 = new attack("Surf", 70);
        attack water2 = new attack("Hydro Pump", 110);
        attack water3 = new attack("Water gun", 40);
        attack water4 = new attack("Blizzard", 100);

        attacks.add(water1);
        attacks.add(water2);
        attacks.add(water3);
        attacks.add(water4);

        for (attack attack : attacks) {
            System.out.println("Attackname: " + attack.getAttackName() + " Damage: " + attack.getDamage());

        }
    }
}


