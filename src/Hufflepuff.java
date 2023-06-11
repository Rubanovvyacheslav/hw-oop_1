public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int spellPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, spellPower, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    @Override
    int calculateSpecificScore() {
        return this.diligence + this.loyalty + this.honesty;
    }

    @Override
    void printCompareOfStudents(Hogwarts obj1, Hogwarts obj2) {
        System.out.printf("%s лучший Пуффендуец, чем %s%n", obj1.getName(), obj2.getName());
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}
