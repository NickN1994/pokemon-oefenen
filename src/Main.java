import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fire Charizard = new Fire("Charizard", "Fire", 55, 300, 90);
        Fire Typhlosion = new Fire("Typhlosion", "Fire", 50, 100, 84);
        Water Blastoise = new Water("Blastoise", "Water", 50, 100, false);


        Blastoise.wild();
        System.out.println("\n");
        System.out.println("Choose your Pokémon");
        System.out.println("\n");
        Charizard.chooseYou();

        System.out.println("\n");

        attack.printAttack();
        System.out.println("\n");
        Blastoise.attackMove();
        System.out.println("\n");
        attackTwo.printAttackWater();

    }

}