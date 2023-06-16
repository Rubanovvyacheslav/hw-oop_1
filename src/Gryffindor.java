public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int spellPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, spellPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    @Override
    int calculateSpecificScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    void printCompareOfStudents(Hogwarts obj1, Hogwarts obj2) {
        System.out.printf("%s лучший Гриффиндорец, чем %s%n", obj1.getName(), obj2.getName());
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }
}
