package ModelElements;

import java.util.Arrays;
import java.util.List;


public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures){
        this.textures = textures;
        this.poligons = Arrays.asList(new Poligon());
        
    }
}
