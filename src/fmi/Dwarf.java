package fmi;

import static fmi.Constants.BICYCLE_COMMAND;
import static fmi.Constants.DOLL_COMMAND;

public class Dwarf implements Observer {

    private final String name;
    private final Workshop workshop;
    private Observable magicBoard;

    public Dwarf(String name, Workshop workshop) {
        this.name = name;
        this.workshop = workshop;
    }

    @Override
    public void update() {
        if (this.magicBoard == null) {
            System.out.println("No command");
            return;
        }

        String command = this.magicBoard.getUpdate();

        switch (command) {
            case DOLL_COMMAND -> {
                workshop.dollsFactory.produceToy();
                System.out.println(this.name + " got a " + command);
            }
            case BICYCLE_COMMAND -> {
                workshop.bicyclesFactory.produceToy();
                System.out.println(this.name + " got a " + command);
            }
            default -> System.out.println("No command");
        }
    }

    @Override
    public void setObservable(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }

}
