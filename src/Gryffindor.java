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
                '}';
    }

    public static void printGryffindor(Gryffindor obj) {
        System.out.printf("Ученик - %s, Колдовство - %s, Трансгрессия - %s, Благородство - %s, Честь - %s, Храбрость - %s%n", obj.getName(), obj.getSpellPower(), obj.getApparitionDistance(), obj.getNobility(), obj.getHonor(), obj.getBravery());
    }

    public static void compareGryffindor(Gryffindor name1, Gryffindor name2) {
        int pointname1 = name1.getSpellPower() + name1.getApparitionDistance() + name1.getNobility() + name1.getHonor() + name1.getBravery();
        int pointname2 = name2.getSpellPower() + name2.getApparitionDistance() + name2.getNobility() + name2.getHonor() + name2.getBravery();
        if (pointname1 > pointname2) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Гриффиндорец, чем %s%n", name1.getName(), pointname1, name2.getName(), pointname2, name1.getName(), name2.getName());
        } else if (pointname2 > pointname1) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Гриффиндорец, чем %s%n", name2.getName(), pointname2, name1.getName(), pointname1, name2.getName(), name1.getName());
        } else
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. Гриффиндорцы равны%n", name2.getName(), pointname2, name1.getName(), pointname1);
    }

}
