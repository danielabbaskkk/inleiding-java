package H08;

import java.awt.*;
import java.applet.*;


public class Knop extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "Daniel abbas" );
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.gray);
        g.drawString("wie is knap ?", 50, 60 );
    }
}