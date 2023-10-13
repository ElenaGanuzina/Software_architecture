package ModelElements;

import java.util.List;

import Extras.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> Models, List<Flash> Flashes, List<Camera> Cameras) throws Exception{
        this.id = id;

        if (Models.size() == 0){
            throw new Exception("There must be at least one model in the list of Poligonal Models.");
        }else{
            this.Models = Models;
        }
        this.Flashes = Flashes;      

        if (Cameras.size() == 0){
            throw new Exception("There must be at least one camera in the list of Cameras.");
        }
        this.Cameras = Cameras;
    }

    public Type method1(Type type){
       return type; 
    }

    public Type method2(Type type1, Type type2){
        return type1;
    }
}
