package exercises;

import exercises.Polygons.Rectangle;
import exercises.Polygons.Square;
import exercises.Polygons.Triangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPolygonsImproved extends Component {
    private ArrayList<Polygon> polygons;

    private DrawPolygonsImproved(){
        polygons = new ArrayList<>();

        Square p1 =
                new Square( new Point (100,100),30);
        Triangle p2 =
                new Triangle(new Point (150,150),40);
        exercises.Polygons.Rectangle p3 =
                new Rectangle(new Point(100,200),80,20);

        polygons.add(p1);
        polygons.add(p2);
        polygons.add(p3);
    }

    @Override
    public void paint(Graphics g) {
        for (Polygon p : polygons) {
            p.paint(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPolygonsImproved polygons = new DrawPolygonsImproved();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);

    }
}
