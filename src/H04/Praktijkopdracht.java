package H04;

import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);


        g.drawLine(20,20,220,20);
        g.drawString("Lijn",105,40);


        g.drawRect(20,50,200,100);
        g.drawString("Rechthoek",90,165);


        g.drawRoundRect(20,170,200,100,30,30);
        g.drawString("Afgeronde Rechthoek",60,285);


        g.setColor(Color.magenta);
        g.fillRect(240,50,200,100);
        g.setColor(Color.black);
        g.drawOval(240,50,200,100);
        g.drawString("Gevulde rechthoek met ovaal", 260, 165);


        g.setColor(Color.magenta);
        g.fillOval(240,170,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",300,285);


        g.setColor(Color.magenta);
        g.fillArc(460,50,200,100,0,45);
        g.setColor(Color.black);
        g.drawOval(460,50,200,100);
        g.drawString("Taartpunt met ovaal eromheen",480,165);


        g.setColor(Color.black);
        g.drawArc(510,170,100,100, 0, 360);
        g.drawString("Cirkel",545,285);
    }
}