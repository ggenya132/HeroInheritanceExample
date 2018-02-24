public class WonderWoman extends Hero implements SuperStrengthHaver {

    public void liftShit(){
        System.out.println(this.heroName + " is doing a good job of kind of lifting some shit but Gal Gadot looks so damn good doing it, it really doesn't matter");
    }

    public WonderWoman(String alignment, String heroName) {
        super(alignment, heroName);
    }

    public WonderWoman(String name, String ocupation, boolean hasGivenUpOnLife, String alignment, String heroName) {
        super(name, ocupation, hasGivenUpOnLife, alignment, heroName);
    }
}
