package fmi;

public class Workshop {
    final DollsFactory dollsFactory;
    final BicyclesFactory bicyclesFactory;

    public Workshop(DollsFactory dollsFactory, BicyclesFactory bicyclesFactory) {
        this.dollsFactory = dollsFactory;
        this.bicyclesFactory = bicyclesFactory;
    }

}
