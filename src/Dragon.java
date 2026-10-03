public class Dragon extends Creature {
    private double wingSpanMeter;

    public Dragon(String name, int threatLevel, double wingSpanMeter){
        super(name, threatLevel);
        this.wingSpanMeter = wingSpanMeter;
    }

    @Override
    public void react(){
        System.out.println(getName() + " wingspan is " + wingSpanMeter + " meters and it breathes out a brilliant blue flame.");
    }

    public double getWingSpanMeter(){
        return wingSpanMeter;
    }
}
