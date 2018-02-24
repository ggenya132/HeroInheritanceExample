public class Superman  extends Hero implements SeeThroughWaller, SuperStrengthHaver {


    public void seeThroughWalls(){
        System.out.println(this.heroName + " is seeing through your clothes");
    }

    public void liftShit(){
        System.out.println(this.heroName + " is lifting ALL the shit");
    }

    public Superman(String alignment, String heroName) {
        super(alignment, heroName);
    }

    public Superman(String name, String ocupation, boolean hasGivenUpOnLife, String alignment, String heroName) {
        super(name, ocupation, hasGivenUpOnLife, alignment, heroName);
    }
}
