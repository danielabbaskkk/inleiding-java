package H011;


import java.awt.*;
import java.applet.*;


    public class h0112 extends Applet {

        public void init() {}

        public void paint(Graphics g) {
            setBackground(Color.gray);
            int teller;
            int y = 0;

            for(teller = 10; teller < 21; teller++) {
                y += 20;

                g.drawString("" + teller, 305, y );
            }
        }
    }

