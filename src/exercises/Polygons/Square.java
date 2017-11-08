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

    public boolean overlaps(Square p){
        System.out.println("Square.overlaps: " + this.toString() + " vs " + p.toString());
        return true;
    }


    @Override
    public boolean overlaps(Polygon p){
        System.out.println("Square.polygon.overlaps: " + this.toString() + " vs " + p.toString());
        return true;
    }
    @Override
    protected void paint(Graphics g){
        g.drawRect(pbd(Directions.LEFT),
                pbd(Directions.UP),
                getWidth(),getHeight());
    }
    @Override
    public String toString(){
        return "Square";
    }

}
