package fmi;

public class BicyclesFactory extends WorkshopFactory {

    @Override
    public WorkshopToy createToy() {
        return new Bicycle();
    }
}
