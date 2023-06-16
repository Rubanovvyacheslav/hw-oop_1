public abstract class Hogwarts {

    private String name;
    private int spellPower;
    private int apparitionDistance;

    public Hogwarts(String name, int spellPower, int apparitionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.apparitionDistance = apparitionDistance;
    }

    private int calculateGeneralScore() {
        return this.spellPower + this.apparitionDistance;
    }

    abstract int calculateSpecificScore();

    public void compareByGeneral(Hogwarts name) {
        if (getSpellPower() > name.getSpellPower()) {
            System.out.printf("%s обладает большей силой заклинаний, чем %s%n", getName(), name.getName());
        } else if (getSpellPower() < name.getSpellPower()) {
            System.out.printf("%s обладает большей силой заклинаний, чем %s%n", name.getName(), getName());
        } else {
            System.out.printf("%s и %s обладают одинаковой силой заклинаний %n", name.getName(), getName());
        }
        if (getApparitionDistance() > name.apparitionDistance) {
            System.out.printf("%s обладает большей дальностью трансгрессирования, чем %s%n", getName(), name.getName());
        } else if (getApparitionDistance() < name.apparitionDistance) {
            System.out.printf("%s обладает большей дальностью трансгрессирования, чем %s%n", name.getName(), getName());
        } else {
            System.out.printf("%s и %s обладают одинаковой дальностью трансгрессирования %n", name.getName(), getName());
        }
    }

    private void compareBySpecific(Hogwarts name) {
        int thisScore = this.calculateSpecificScore() + this.calculateSpecificScore();
        int otherScore = name.calculateGeneralScore() + name.calculateSpecificScore();
        if (thisScore > otherScore) {
            printCompareOfStudents(this, name);
        } else if (thisScore < otherScore) {
            printCompareOfStudents(name, this);
        } else {
            System.out.println("Волшебники равны по силе");
        }
    }

    abstract void printCompareOfStudents(Hogwarts obj1, Hogwarts obj2);



    public void compare(Hogwarts name) {
        if (this.getClass().equals(name.getClass())) {
            compareBySpecific(name);
        } else {
            compareByGeneral(name);
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", spellPower=" + spellPower +
                ", apparitionDistance=" + apparitionDistance +
                '}';
    }
}
