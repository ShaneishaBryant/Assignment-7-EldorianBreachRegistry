import javax.crypto.SecretKey;
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //array to hold any creature
        ArrayList<Creature> creatureRoster = new ArrayList<>();

        //instances of different subclasses
        creatureRoster.add(new Dragon("Gringotts", 8, 18.8));
        creatureRoster.add(new Spirit("Dementor", 10, "Amortal Non-Being"));
        creatureRoster.add(new Golem("Bore", 5, "Plutonium"));

        System.out.println("--- Captured Entity Report ---");
        System.out.println();

        //iterate through roster
        for(Creature entity : creatureRoster) {
            System.out.println("Creature Name: " + entity.getName());
            System.out.println("Threat Level: " + entity.getThreatLevel());
            entity.react();
            System.out.println();
        }







        //test code//
        /*Creature entity = new Creature("Gringotts", 8);
        //attributes
        System.out.println("--- Captured Entity Report ---");
        System.out.println("Creature Name: " + entity.getName());
        System.out.println("Threat Level: " + entity.getThreatLevel());
        entity.react();
        System.out.println();

        Creature entity2 = new Dragon("Pixel", 4, 14.5);
        Creature entity3 = new Spirit("Dementor", 10, "Amortal Non-Beings");

        System.out.println();
        System.out.println("Creature Name: " + entity2.getName());
        System.out.println("Threat Level: " + entity2.getThreatLevel());
        entity2.react();

        System.out.println();
        System.out.println("Creature Name: " + entity3.getName());
        System.out.println("Threat Level: " + entity3.getThreatLevel());
        entity3.react();*/

    }
}
