package H04;

import java.applet.Applet;
import java.awt.*;

public class StopLicht extends Applet {

    public void init(){}

    public void paint(Graphics g){
        setBackground(Color.cyan);
        g.fillRect(20,20, 100, 200);
        g.setColor(Color.red);
        g.fillArc(40,30,60,60,0,360);
        g.setColor(Color.orange);
        g.fillArc(40, 92, 60,60,0,360);
        g.setColor(Color.green);
        g.fillArc(40,154,60,60,0,360);
    }
}
