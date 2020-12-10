package H010;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h105 extends Applet {

    int gemiddelde, aantal;
    Button knop;
    TextField tv;
    String geslaagd, tekst;

    public void init() {

        knop = new Button("OK");
        tv = new TextField(50);
        knop.addActionListener(new knopListener());
        add(knop);
        add(tv);

    }

    public void paint(Graphics g) {

        setBackground(Color.gray);
        g.drawString("Het ingevoerde getal: " + tekst, 20,80);
        g.drawString("Het gemiddelde: " + (gemiddelde / aantal), 20,100);
        g.drawString("Geslaagd: " + geslaagd, 20,120);

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tv.getText();
            int invoer = Integer.parseInt(s);
            if (invoer <= 5) {
                tekst = "Onvoldoende";
                gemiddelde += invoer;
                aantal++;
            } else if (invoer > 5) {
                tekst = "Voldoende";
                gemiddelde += invoer;
                aantal++;
            } else if (invoer > 10) {
                tekst = "ERROR";
            } else if (invoer < 0) {
                tekst = "ERROR";
            } else {
                tekst = "ERROR";
            }

            if (gemiddelde / aantal <= 5) {
                geslaagd = "Nee";
            } else {
                geslaagd = "Ja";
            }
            repaint();
        }
    }
}