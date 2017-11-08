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

        Polygon p1 =
                new Square( new Point (100,100),30);
        Polygon p2 =
                new Triangle(new Point (150,150),40);
        Polygon p3 =
                new Rectangle(new Point(100,200),80,20);

        Rectangle p4 =
                new Rectangle(new Point(100,200),80,20);

        polygons.add(p1);
        polygons.add(p2);
        polygons.add(p3);
        polygons.add(p4);

        p1.overlaps(p4);
        p2.overlaps(p3);
        p3.overlaps(p1);
        p4.overlaps(p4);

        for (Polygon p : polygons) {
            p.overlaps(p4);
        }
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
