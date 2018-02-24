public class Person {

    private String name;
    private String ocupation;
    private boolean hasGivenUpOnLife;

    public Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public void setHasGivenUpOnLife(boolean hasGivenUpOnLife) {
        this.hasGivenUpOnLife = hasGivenUpOnLife;
    }

    public String getName() {

        return name;
    }

    public String getOcupation() {
        return ocupation;
    }

    public boolean isHasGivenUpOnLife() {
        return hasGivenUpOnLife;
    }

    public Person(String name, String ocupation, boolean hasGivenUpOnLife) {

        this.name = name;
        this.ocupation = ocupation;
        this.hasGivenUpOnLife = hasGivenUpOnLife;
    }
}
