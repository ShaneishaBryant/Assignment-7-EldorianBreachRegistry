public class Spirit extends Creature {
    private String supernaturalType;

    public Spirit(String name, int threatLevel, String supernaturalType){
        super(name, threatLevel);
        this.supernaturalType = supernaturalType;
    }

    @Override
    public void react(){
        System.out.println(getName() + " creates a heavy, suffocating atmosphere that clouds the Royal Guards judgement. ");
    }

    public String getEtherealType(){
        return supernaturalType;
    }
}
