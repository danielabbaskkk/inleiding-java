package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h83 extends Applet {
    TextField tekstvak;
    Button knop;
    String H;
    double getal, a, uitkomst;


    public void init() {

        tekstvak = new TextField("Bereken BTW", 30);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        a = 0.21;
        uitkomst = getal * a;


    }
    public void paint(Graphics g){
     g.drawString("BTW"+getal,22, 59);
    }
class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            H = tekstvak.getText();
            getal = Double.parseDouble(H);
            getal = getal * a + getal;
            repaint();
        }
}
}

