package H04;

import java.applet.Applet;
import java.awt.*;

public class Dobblesteen extends Applet {
    public void init(){}

    public void paint(Graphics g){
        setBackground(Color.green);
        g.setColor(Color.black);
        g.fillRoundRect(20, 20, 200, 200, 30,30);
        g.setColor(Color.white);
        g.fillArc(60,60,40,40,0,360);
        g.fillArc(60,140,40,40,0,360);
        g.fillArc(140,140,40,40,0,360);
        g.fillArc(140,60,40,40,0,360);
    }

}
