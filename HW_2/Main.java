package HW_2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemFabric> generators = Arrays.asList(new GoldGenerator(), new DiamondGenerator(), new PearlGenerator());
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            IGameItem chest = generators.get(random.nextInt(generators.size())).createItem();
            chest.open();
        }
    }
    
}
