package InMemoryModel;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Extras.Angle3D;
import Extras.Color;
import Extras.Point3D;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<IModelChangedObserver> changedObservers)throws Exception{
        this.changedObservers = changedObservers;
        this.Models = Arrays.asList(new PoligonalModel(new ArrayList<Texture>()));
        this.Scenes = new ArrayList<>();
        this.Flashes = Arrays.asList(new Flash(new Point3D(), new Angle3D(), new Color(), 0));
        this.Cameras = Arrays.asList(new Camera(new Point3D(), new Angle3D()));

        Models.add(new PoligonalModel(new ArrayList<Texture>()));
        Flashes.add(new Flash(new Point3D(), new Angle3D(), new Color(), 0));
        Cameras.add(new Camera(new Point3D(), new Angle3D()));
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
        }

    public Scene GetScene(int id){
        for (int i = 0; i < Scenes.size(); i ++){
            if (Scenes.get(i).id == id){
                return Scenes.get(i);
            }
        }
        return null;
        
    }

    public void NotifyChange(IModelChanger sender){

    }

}
