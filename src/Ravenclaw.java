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
                '}';
    }

    public static void printRavenclaw(Ravenclaw obj) {
        System.out.printf("Ученик - %s, Колдовство - %s, Трансгрессия - %s, Ум - %s, Мудрость - %s, Остроумие - %s, Творчество - %s%n", obj.getName(), obj.getSpellPower(), obj.getApparitionDistance(), obj.getSmart(), obj.getWisdom(), obj.getWit(), obj.getCreative());
    }

    public static void compareRavenclaw(Ravenclaw name1, Ravenclaw name2) {
        int pointname1 = name1.getSpellPower() + name1.getApparitionDistance() + name1.getSmart() + name1.getWisdom() + name1.getWit() + name1.getCreative();
        int pointname2 = name2.getSpellPower() + name2.getApparitionDistance() + name2.getSmart() + name2.getWisdom() + name2.getWit() + name2.getCreative();
        if (pointname1 > pointname2) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Когтевранец, чем %s%n", name1.getName(), pointname1, name2.getName(), pointname2, name1.getName(), name2.getName());
        } else if (pointname2 > pointname1) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Когтевранец, чем %s%n", name2.getName(), pointname2, name1.getName(), pointname1, name2.getName(), name1.getName());
        } else
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. Когтевранцы равны%n", name2.getName(), pointname2, name1.getName(), pointname1);
    }
}
