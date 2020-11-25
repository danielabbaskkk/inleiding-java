package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testtwee extends Applet {
    TextField tekstvak = new TextField("", 30);
    Button knop;

    public void init() {
        tekstvak = new TextField("", 40);
        knop = new Button("ja");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {

        setBackground( new Color(193, 9, 227, 218) );
        g.setColor(Color.lightGray);
        g.setFont(new Font("default", Font.ITALIC, 20));
        g.drawString("doet deze knop iets?" +
                "" +
                "", 50, 60 );
    }

    class KnopListener implements ActionListener	{

        public void actionPerformed( ActionEvent e ) {

            tekstvak.setText("" +
                     "donderop");
            repaint();
        }
    }
}