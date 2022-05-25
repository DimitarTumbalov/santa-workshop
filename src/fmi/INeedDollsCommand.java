package fmi;

public class INeedDollsCommand implements Command {
    private final MagicBoard magicBoard;

    public INeedDollsCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        this.magicBoard.requestDoll();
    }

    @Override
    public void undo() {
        this.magicBoard.undoCommand();
    }
}
