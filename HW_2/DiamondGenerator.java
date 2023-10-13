package HW_2;

public class DiamondGenerator extends ItemFabric {
    
    @Override
    public IGameItem createItem() {
        System.out.println("Created a new chest");
        return new DiamondReward();
    }
}
