package H04;

import java.applet.Applet;
import java.awt.*;

public class driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        getGraphics().setColor(Color.green);
        g.drawLine(20,20,60,70);
        g.drawLine(60,70,100,20);
        g.drawLine(20,20, 100,20);
    }

}