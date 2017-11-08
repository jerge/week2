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

    public boolean overlaps(Rectangle p){
        System.out.println("Rectangle.overlaps: " + this.toString() + " vs " + p.toString());
        return true;
    }

    @Override
    public boolean overlaps(Polygon p){
        System.out.println("Rectangle.polygon.overlaps: " + this.toString() + " vs " + p.toString());
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
        return "Rectangle";
    }

}
