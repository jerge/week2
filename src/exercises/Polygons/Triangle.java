package exercises.Polygons;

import exercises.utils.Directions;
import exercises.Polygon;

import java.awt.*;

public class Triangle extends Polygon {

    public Triangle(Point center, int length){
        height = length;
        width = length;
        this.center = center;
    }

    @Override
    protected void paint(Graphics g){
        g.drawLine(getCenter().x, pbd(Directions.UP),
                pbd(Directions.LEFT), pbd(Directions.DOWN));
        g.drawLine(pbd(Directions.LEFT), pbd(Directions.DOWN),
                pbd(Directions.RIGHT), pbd(Directions.DOWN));
        g.drawLine(pbd(Directions.RIGHT), pbd(Directions.DOWN),
                getCenter().x, pbd(Directions.UP));
    }

}
