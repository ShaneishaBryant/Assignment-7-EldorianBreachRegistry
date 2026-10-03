public class Creature {
    private String name;
    private int threatLevel;

    //initialize values
    public Creature(String name, int threatLevel) {
        this.name = name;
        this.threatLevel = threatLevel;

    }

    //class for official protocol - no subclass can override
    public final void verifyContainment(){
        System.out.println("Creature: " + name
                + " | Threat Level: " + threatLevel
                + " | Containment Status: SECURE");
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