package H04;

import java.applet.Applet;
import java.awt.*;

public class FillArc extends Applet {
    public void init(){

    }
    public void paint(Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(30,30,180, 250, 90,360);
    }
}
