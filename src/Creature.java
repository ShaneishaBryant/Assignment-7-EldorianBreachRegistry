public class Creature {
    private String name;
    private int threatLevel;

    //initialize values
    public Creature(String name, int threatLevel) {
        this.name = name;
        this.threatLevel = threatLevel;

    }

    //basic action method
    public void react() {
        System.out.println(name + " rattles its warding chains and glares menacingly at the Royal Guard!");
    }

    //public getters
    public String getName() {
        return name;
    }
    public int getThreatLevel(){
        return threatLevel;
    }
}