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

    public boolean overlaps(Triangle p){
        System.out.println("Triangle.overlaps: " + this.toString() + " vs " + p.toString());
        return true;
    }


    @Override
    public boolean overlaps(Polygon p){
        System.out.println("Triangle.polygon.overlaps: " + this.toString() + " vs " + p.toString());
        return true;
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


    @Override
    public String toString(){
        return "Triangle";
    }

}
