package ModelElements;

import Extras.Angle3D;
import Extras.Point3D;
import Extras.Color;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public float Power;

    public Flash(Point3D Location, Angle3D Angle, Color Color, float Power){
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
    }

    public void Rotate(Angle3D Angle){

    }
    
    public void Move (Point3D Location){

    }
}
