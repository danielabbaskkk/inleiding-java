package H012;

import java.awt.*;
import java.applet.*;

public class h0121 extends Applet {
    double salaris[];

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
    }
}