package H04;

import java.awt.*;
import java.applet.*;

public class h01 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);

        g.fillRect(20, 100, 100, 50);

        g.setColor(Color.white);
        g.fillRect(20, 150, 100, 50);

        g.setColor(Color.blue);
        g.fillRect(20, 200, 100, 50);

    }
}