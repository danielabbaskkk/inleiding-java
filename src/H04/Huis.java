package H04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);

        //Huis
        g.drawRect(100, 100, 200, 200);

        //Raam
        g.drawRect(125,125,50,50);

        //Deur
        g.drawRect(175,220,50,80);

        //Dak
        g.drawLine(80, 100, 320, 100);
        g.drawLine(80,100,200,20);
        g.drawLine(320,100,200,20);

    }

}