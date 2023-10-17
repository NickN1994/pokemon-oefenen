import java.util.ArrayList;
import java.util.List;

public class Fire extends Pokemon {

private int xp;
private int attackPower;

String attackName;
int damage;


    public Fire(String name, String type, int level, int xp, int attackPower) {
        super(name, type, level);
        this.xp = xp;
        this.attackPower = attackPower;

    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public void eats() {
        System.out.println(getName() + "eats a fire berry");
    }

//    public void printAttack(){
//        System.out.println(getName() + " drinkt");
//    }
}
