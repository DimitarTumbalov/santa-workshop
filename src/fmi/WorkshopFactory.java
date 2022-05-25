package fmi;

public abstract class WorkshopFactory {

    public abstract WorkshopToy createToy();

    public WorkshopToy produceToy() {
        WorkshopToy toy = createToy();
        toy.prepare();
        return toy;
    }
}
