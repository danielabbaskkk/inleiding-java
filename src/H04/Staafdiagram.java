package H04;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {
    public void init(){}
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
            g.drawString("valerie",70, 200);
            g.fillRect(60,140,50,40);

            //Jeroen
            g.setColor(Color.blue);
            g.drawString("Jeroen",120, 200);
            g.fillRect(110, 80,50, 100);

            //Hans

            g.setColor(Color.green);
            g.drawString("Hans",170, 200);
            g.fillRect(160, 100, 50, 80);
        }

}




