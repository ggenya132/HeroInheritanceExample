public class HeroDispatcher {

    SeeThroughWaller heroWhoCanSeeThroughWalls;
    SuperStrengthHaver heroWhoHasSuperStrength;

    public HeroDispatcher(SeeThroughWaller heroWhoCanSeeThroughWalls, SuperStrengthHaver heroWhoHasSuperStrength) {
        this.heroWhoCanSeeThroughWalls = heroWhoCanSeeThroughWalls;
        this.heroWhoHasSuperStrength = heroWhoHasSuperStrength;
    }

    public void callAllPowers(){
        heroWhoCanSeeThroughWalls.seeThroughWalls();
        heroWhoHasSuperStrength.liftShit();
    }
}
