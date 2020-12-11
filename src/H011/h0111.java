package H011;

import java.awt.*;
import java.applet.*;


    public class h0111 extends Applet {

        public void init() {}

        public void paint(Graphics g) {
            setBackground(Color.gray);
            int teller;
            int y = 0;

            for(teller = 0; teller < 10; teller++) {
                y += 20;
                g.drawLine(50 , y, 300, y );
                g.drawString("" + teller, 305, y );
            }

        }
    }

