package fmi;

public class INeedBicyclesCommand implements Command {

    private final MagicBoard magicBoard;

    public INeedBicyclesCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute() {
        this.magicBoard.requestBicycle();
    }

    @Override
    public void undo() {
        this.magicBoard.undoCommand();
    }

}