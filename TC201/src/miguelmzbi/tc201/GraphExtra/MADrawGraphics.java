package miguelmzbi.tc201.GraphExtra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class MADrawGraphics {
    MABouncingBox box;
    ArrayList<MABouncingBox> boxes = new ArrayList<MABouncingBox>();
    
    /** Initializes this class for drawing. */
    public MADrawGraphics() {
    	MABouncingBox box1 = new MABouncingBox(100, 50, Color.RED);
    	box1.setMovementVector(10, 2);
    	
    	MABouncingBox box2 = new MABouncingBox(100, 50, Color.BLUE);
    	box2.setMovementVector(5, 5);
    	
    	MABouncingBox box3 = new MABouncingBox(100, 50, Color.GREEN);
    	box3.setMovementVector(2, 10);
    	
    	boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
 
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        int xCoo[]={30,40,50,60,80};
        int yCoo[]={50,80,30,80,50};
        surface.drawPolygon(xCoo,yCoo,5);
        
        surface.drawArc(200, 200, 50, 30, 0, 180);
        
        Image img1 = new ImageIcon("th.jpeg").getImage();
        surface.drawImage(img1, 0, 0, null);

        for(int i = 0; i < boxes.size(); i++){
        	boxes.get(i).draw(surface);
        }
    }
} 
