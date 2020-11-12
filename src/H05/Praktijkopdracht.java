package H05;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {

            setBackground(Color.white);
            g.setColor(lijnkleur);


            g.drawLine(20,20,breedte+20,20);
            g.drawString("Lijn",105,40);


            g.drawRect(20,50,breedte,hoogte);
            g.drawString("Rechthoek",90,165);


            g.drawRoundRect(20,170,breedte,hoogte,30,30);
            g.drawString("Afgeronde Rechthoek",60,285);


            g.setColor(opvulkleur);
            g.fillRect(240,50,breedte,hoogte);
            g.setColor(lijnkleur);
            g.drawOval(240,50,breedte,hoogte);
            g.drawString("Gevulde rechthoek met ovaal", 260, 165);


            g.setColor(opvulkleur);
            g.fillOval(240,170,breedte,hoogte);
            g.setColor(lijnkleur);
            g.drawString("Gevulde ovaal",300,285);


            g.setColor(opvulkleur);
            g.fillArc(460,50,breedte,hoogte,0,45);
            g.setColor(lijnkleur);
            g.drawOval(460,50,breedte,hoogte);
            g.drawString("Taartpunt met ovaal eromheen",480,165);


            g.setColor(lijnkleur);
            g.drawArc(510,170,breedte-100,hoogte, 0, 360);
            g.drawString("Cirkel",545,285);
        }
}
