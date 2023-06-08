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
                '}';
    }

    public static void printSlytherin(Slytherin obj) {
        System.out.printf("Ученик - %s, Колдовство - %s, Трансгрессия - %s, Хитрость - %s, Решительность - %s, Амбициозность - %s, Находчивость - %s, Жажда власти - %s%n", obj.getName(), obj.getSpellPower(), obj.getApparitionDistance(), obj.getCunning(), obj.getResolve(), obj.getAmbition(), obj.getResourcefulness(), obj.getlFPower());
    }

    public static void compareSlytherin(Slytherin name1, Slytherin name2) {
        int pointname1 = name1.getSpellPower() + name1.getApparitionDistance() + name1.getCunning() + name1.getResolve() + name1.getAmbition() + name1.getResourcefulness() + name1.getlFPower();
        int pointname2 = name2.getSpellPower() + name2.getApparitionDistance() + name2.getCunning() + name2.getResolve() + name2.getAmbition() + name2.getResourcefulness() + name2.getlFPower();
        if (pointname1 > pointname2) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Слизеринец, чем %s%n", name1.getName(), pointname1, name2.getName(), pointname2, name1.getName(), name2.getName());
        } else if (pointname2 > pointname1) {
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. %s лучший Слизеринец, чем %s%n", name2.getName(), pointname2, name1.getName(), pointname1, name2.getName(), name1.getName());
        } else
            System.out.printf("У %s сумма баллов равна %s, у %s сумма баллов равна %s. Слизеринцы равны%n", name2.getName(), pointname2, name1.getName(), pointname1);
    }
}
