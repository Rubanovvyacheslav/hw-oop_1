// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 8, 11, 10, 11, 12);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 10, 12, 9, 11, 8);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 6, 8, 8, 9, 13);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 7, 10, 10, 10, 10);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 9, 11, 8, 12, 11);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch Fletchley", 5, 8, 7, 6, 8);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 8, 6, 4, 5, 8, 9);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 8, 7, 4, 6, 7, 9);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 9, 8, 7, 6, 8, 9);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 8, 11, 5, 6, 5, 5, 4);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu", 6, 6, 5, 6, 7, 5, 6);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 5, 5, 6, 4, 8, 9, 7);

        harryPotter.compare(ronWeasley);
        harryPotter.compare(marcusBelby);
        cedricDiggory.compare(dracoMalfoy);
        zachariasSmith.compare(justinFinchFletchley);

    }
}

