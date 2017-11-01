package exercises.Polygons;

import exercises.utils.Directions;
import exercises.Polygon;

import java.awt.*;

public class Rectangle extends Polygon {

    public Rectangle(Point center, int width, int height){
        this.height = height;
        this.width = width;
        this.center = center;
    }

    @Override
    protected void paint(Graphics g){
        g.drawRect(pbd(Directions.LEFT),
                pbd(Directions.UP),
                getWidth(),getHeight());
    }

}
