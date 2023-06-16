public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int spellPower, int apparitionDistance, int smart, int wisdom, int wit, int creative) {
        super(name, spellPower, apparitionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }


    @Override
    int calculateSpecificScore() {
        return this.smart + this.wisdom + this.wit + this.creative;
    }

    @Override
    void printCompareOfStudents(Hogwarts obj1, Hogwarts obj2) {
        System.out.printf("%s лучший Когтевранец, чем %s%n", obj1.getName(), obj2.getName());
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative +
                "} " + super.toString();
    }
}
