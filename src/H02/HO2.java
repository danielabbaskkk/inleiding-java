package H02;

import java.awt.*;
import java.applet.*;

public class HO2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Daniel", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Abbaszadeh", 90, 60 );
    }
}