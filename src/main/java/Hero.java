public class Hero extends Person {

    String alignment;
    String heroName;

    public Hero(String alignment, String heroName) {
        this.alignment = alignment;
        this.heroName = heroName;
    }

    public Hero(String name, String ocupation, boolean hasGivenUpOnLife, String alignment, String heroName) {
        super(name, ocupation, hasGivenUpOnLife);
        this.alignment = alignment;
        this.heroName = heroName;
    }

    public String getAlignment() {

        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }
}
