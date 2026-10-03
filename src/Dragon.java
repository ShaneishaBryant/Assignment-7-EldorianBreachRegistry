public class Dragon extends Creature {
    private double wingSpan;

    public Dragon(String name, int threatLevel, double wingSpan){
        super(name, threatLevel);
        this.wingSpan = wingSpan;
    }

    @Override
    public void react(){
        System.out.println(getName() + " breathes out a brilliant blue flame that can reduce timbers and bones to ashes instantly!");
    }

    public double getWingSpan(){
        return wingSpan;
    }
}
