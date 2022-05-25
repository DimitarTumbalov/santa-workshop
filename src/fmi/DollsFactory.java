package fmi;

public class DollsFactory extends WorkshopFactory {
    @Override
    public WorkshopToy createToy() {
        return new Doll();
    }
}
