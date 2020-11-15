package H08;

import java.awt.*;
import java.applet.*;


public class Knop extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "$2,50" );
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.gray);
        g.drawString("hoeveel kost patat met ?", 50, 60 );
    }
}