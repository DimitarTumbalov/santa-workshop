package fmi;

public class App {

    public static void main(String[] args) {
        // Create the magic board
        MagicBoard magicBoard = new MagicBoard();

        // Create Santa
        Santa santa = Santa.getInstance(magicBoard);

        // Create Workshop
        Workshop workshop = new Workshop(new DollsFactory(), new BicyclesFactory());
        // Create the dwarfs
        Observer dwarf1 = new Dwarf("Dwarf1", workshop);
        Observer dwarf2 = new Dwarf("Dwarf2", workshop);
        Observer dwarf3 = new Dwarf("Dwarf3", workshop);

        // Subscribe the dwarfs to the magic board
        magicBoard.subscribe(dwarf1);
        magicBoard.subscribe(dwarf2);
        magicBoard.subscribe(dwarf3);

        // Santa says the magic words for the magic board
        santa.sayMagicWords(Constants.BICYCLES_MAGIC_WORDS);
        magicBoard.unsubscribe(dwarf1);
        santa.sayMagicWords(Constants.DOLLS_MAGIC_WORDS);
    }

}
