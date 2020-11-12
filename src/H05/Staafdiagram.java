package H05;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {
    int valerie;
    int jeroen;
    int hans;

    public void init(){
        valerie = 40;
        jeroen = 90;
        hans = 60;
    }
    public void paint(Graphics g){
        //Achtergrond
        g.drawRect(60,20, 150,160);

        //verdeling
        g.drawString("0KG", 10, 180);
        g.drawString("20KG", 10, 160);
        g.drawString("40KG", 10, 140);
        g.drawString("60KG", 10, 120);
        g.drawString("80KG", 10, 100);
        g.drawString("100KG", 10, 80);
        g.drawString("120KG", 10, 60);

        //Valerie
        g.setColor(Color.red);
        g.drawString("Valerie",70, 200);
        g.fillRect(60,180-valerie,50,valerie);

        //Jeroen
        g.setColor(Color.blue);
        g.drawString("Jeroen",120, 200);
        g.fillRect(110, 180-jeroen,50, jeroen);

        //Hans

        g.setColor(Color.green);
        g.drawString("Hans",170, 200);
        g.fillRect(160, 180-hans, 50, hans);

    }
}
