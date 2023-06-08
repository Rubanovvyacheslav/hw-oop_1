public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int spellPower, int apparitionDistance, int diligence, int loyalty, int honesty) {
        super(name, spellPower, apparitionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
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
                '}';
    }

    public static void printHufflepuff(Hufflepuff obj) {
        System.out.printf("Ученик - %s, Колдовство - %s, Трансгрессия - %s, Трудолюбие - %s, Верность - %s, Честность - %s%n", obj.getName(), obj.getSpellPower(), obj.getApparitionDistance(), obj.getDiligence(), obj.getLoyalty(), obj.getHonesty());
    }

    public static void compareHufflepuff(Hufflepuff name1, Hufflepuff name2) {
        int pointname1 = name1.getSpellPower() + name1.getApparitionDistance() + name1.getDiligence() + name1.getLoyalty() + name1.getHonesty();
        int pointname2 = name2.getSpellPower() + name2.getApparitionDistance() + name2.getDiligence() + name2.getLoyalty() + name2.getHonesty();
        if (pointname1 > pointname2) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Пуффендуец, чем %s%n", name1.getName(), pointname1, name2.getName(), pointname2, name1.getName(), name2.getName());
        } else if (pointname2 > pointname1) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Пуффендуец, чем %s%n", name2.getName(), pointname2, name1.getName(), pointname1, name2.getName(), name1.getName());
        } else
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. Пуффендуйцы равны%n", name2.getName(), pointname2, name1.getName(), pointname1);
    }
}
