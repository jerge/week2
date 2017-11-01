package exercises.Polygons;

import exercises.utils.Directions;
import exercises.Polygon;

import java.awt.*;

public class Square extends Polygon {

    public Square(Point center, int length){
        height = length;
        width = length;
        this.center = center;
    }

    @Override
    protected void paint(Graphics g){
        g.drawRect(pbd(Directions.LEFT),
                pbd(Directions.UP),
                getWidth(),getHeight());
    }

}
