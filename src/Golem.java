public class Golem extends Creature{
    private String coreMaterial;

    public Golem(String name, int threatLevel, String coreMaterial) {
        super(name, threatLevel);
        this.coreMaterial = coreMaterial;

    }

    @Override
    public void react(){
        System.out.println(getName() + " stomps it's heavy " + coreMaterial + " feet, causing the ground to shake!");
    }
}
