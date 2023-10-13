package HW_2;

public class PearlGenerator extends ItemFabric{

    @Override
    public IGameItem createItem() {
        System.out.println("Created a new chest");
        return new PearlReward();
    }
    
}
