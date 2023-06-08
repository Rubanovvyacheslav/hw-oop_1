public class Hogwarts {

    private String name;
    private int spellPower;
    private int apparitionDistance;

    public Hogwarts(String name, int spellPower, int apparitionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.apparitionDistance = apparitionDistance;
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

    public void compare(Hogwarts name) {
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
}
