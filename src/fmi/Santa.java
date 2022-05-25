package fmi;

import static fmi.Constants.*;

public class Santa {

    private static Santa instance;

    private final MagicBoard magicBoard;

    private Santa(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    public static Santa getInstance(MagicBoard magicBoard) {

        if (instance == null)
            instance = new Santa(magicBoard);

        return instance;
    }

    public void sayMagicWords(String magicWords) {
        System.out.println("Santa said: " + magicWords);

        switch (magicWords) {
            case DOLLS_MAGIC_WORDS -> {
                Command command = new INeedDollsCommand(magicBoard);
                command.execute();
            }
            case BICYCLES_MAGIC_WORDS -> {
                Command command = new INeedBicyclesCommand(magicBoard);
                command.execute();
            }
            case UNDO_MAGIC_WORDS -> magicBoard.undoCommand();
            default -> {
            }
        }
    }

}