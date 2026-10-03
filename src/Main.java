import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args) {

        //instantiate generic creature
        Creature entity = new Creature("Gringotts", 8);
        //attributes
        System.out.println("--- Captured Entity Report ---");
        System.out.println("Creature Name: " + entity.getName());
        System.out.println("Threat Level: " + entity.getThreatLevel());
        //call react method
        entity.react();

        Creature entity2 = new Dragon("Pixel", 4, 14.5);
        Creature entity3 = new Spirit("Dementor", 10, "Amortal Non-Beings");

        System.out.println();
        System.out.println("Creature Name: " + entity2.getName());
        System.out.println("Threat Level: " + entity2.getThreatLevel());
        entity2.react();

        System.out.println();
        System.out.println("Creature Name: " + entity3.getName());
        System.out.println("Threat Level: " + entity3.getThreatLevel());
        entity3.react();

    }
}
