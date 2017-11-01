package exercises;

import exercises.utils.Directions;

import java.awt.*;

public abstract class Polygon {
    protected Point center;
    protected int width;
    protected int height;


    protected abstract void paint(Graphics g);

    protected Point getCenter(){
        return center;
    }

    protected int pbd(Directions direction) { // PointByDirection
        switch (direction) {
            case UP:
                return center.y-height/2;
            case DOWN:
                return center.y+height/2;
            case LEFT:
                return center.x-width/2;
            case RIGHT:
                return center.x+width/2;
            default:
                return 0;
        }
    }


    protected int getWidth(){
        return width;
    }

    protected int getHeight(){
        return height;
    }
}
