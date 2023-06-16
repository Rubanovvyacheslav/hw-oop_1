public class Slytherin extends Hogwarts {
    private int cunning;
    private int resolve;
    private int ambition;
    private int resourcefulness;
    private int lFPower;

    public Slytherin(String name, int spellPower, int apparitionDistance, int cunning, int resolve, int ambition, int resourcefulness, int lFPower) {
        super(name, spellPower, apparitionDistance);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lFPower = lFPower;
    }

    @Override
    int calculateSpecificScore() {
        return this.cunning + this.resolve + this.ambition + this.resourcefulness + this.lFPower;
    }

    @Override
    void printCompareOfStudents(Hogwarts obj1, Hogwarts obj2) {
        System.out.printf("%s Лучший Слизеринец, чем %s%n", obj1.getName(), obj2.getName());


    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getlFPower() {
        return lFPower;
    }

    public void setlFPower(int lFPower) {
        this.lFPower = lFPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", resolve=" + resolve +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lFPower=" + lFPower +
                "} " + super.toString();
    }
}
