public class Dragon extends Creature {
    private double wingSpanMeter;

    public Dragon(String name, int threatLevel, double wingSpanMeter){
        super(name, threatLevel);
        this.wingSpanMeter = wingSpanMeter;
    }

    /*deliberate override test
    public void verifyContainment(){
        System.out.println("[PROTOCOL UPDATED] | Containment Status: SECURE | Creature: " + name);
    }*/

    @Override
    public void react(){
        System.out.println(getName() + " wingspan is " + wingSpanMeter + " meters and it breathes out a brilliant blue flame.");
    }

    public double getWingSpanMeter(){
        return wingSpanMeter;
    }

}
