public class Main {
    public static void main(String[] args){


        Superman clarkKent = new Superman("Good", "SUPERMAN");
        WonderWoman wonderWoman = new WonderWoman("Good", "WONDERWOMAN");
//        clarkKent.liftShit();
//        wonderWoman.liftShit();

        HeroDispatcher heroDispatcher = new HeroDispatcher(clarkKent, clarkKent);
        HeroDispatcher heroDispatcher2 = new HeroDispatcher(clarkKent, wonderWoman);

        heroDispatcher.callAllPowers();
        heroDispatcher2.callAllPowers();
    }
}
