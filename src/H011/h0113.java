package H011;


import java.awt.*;
import java.applet.*;


    public class h0113 extends Applet {

        public void init() {}

        public void paint(Graphics g) {
            int teller = 0;
            int getal = 1;
            int y = 0;


            while(teller < 10) {
                y += 20;
                g.drawLine(50, y, 300, y);
                g.drawString("" + teller, 305, y);

                teller++;

            }
                while(getal < 10){
                    y += 44;
                    g.drawString("" + getal, 308, y);
                    getal++;

            }
        }
    }
