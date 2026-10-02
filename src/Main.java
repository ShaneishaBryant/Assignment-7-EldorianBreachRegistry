public class Main {
    static void main() {
        System.out.println();

        //instantiate generic creature
        Creature entity = new Creature("Gringotts", 8);
        //attributes
        System.out.println("--- Captured Entity Report ---");
        System.out.println("Creature Name: " + entity.getName());
        System.out.println("Threat Level: " + entity.getThreatLevel());
        //call react method
        entity.react();

    }
}
