package H04;

import java.applet.Applet;
import java.awt.*;

public class NederlandseVlag extends Applet{
    public void init(){

    }
    public void paint(Graphics g){
        setBackground(Color.black);


        //Vlag
        g.setColor(Color.RED);
        g.fillRect(20, 20, 300, 50);

        g.setColor(Color.white);
        g.fillRect(20, 70, 300, 50);

        g.setColor(Color.blue);
        g.fillRect(20, 120, 300, 50);


        //Vlaggenstok
        g.setColor(Color.gray);
        g.fillRect(20, 170, 20, 100);
}
    }
