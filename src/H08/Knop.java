package H08;

import java.awt.*;
import java.applet.*;


public class Knop extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "5" );
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.gray);
        g.drawString("wat is meer dan 4", 50, 60 );
    }
}