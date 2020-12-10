package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h82 extends Applet {

    Button Vrouw, Man, POman, POvrouw;
    int Vrouwaantal, Manaantal, Pomanaantal, Povrouwaantal, Totaalaantal;

    public void init(){

        Vrouw = new Button("Vrouw");
        Vrouw.addActionListener(new VrouwListener() );
        Vrouwaantal = 0;
        add(Vrouw);

       Man = new Button("Man");
        Man.addActionListener(new ManListener() );
        Manaantal = 0;
        add(Man);

        POman = new Button("POman");
        POman.addActionListener(new POmanListener() );
        Pomanaantal = 0;
        add(POman);

        POvrouw = new Button("POvrouw");
        POvrouw.addActionListener(new POvrouwListener());
        Povrouwaantal = 0;
        add(POvrouw);
        Totaalaantal = 0;
    }
    public void paint(Graphics g) {
        g.drawString("Vrouw Aantal: " + Vrouwaantal, 20,40);
        g.drawString("Man Aantal: " + Manaantal,20,60);
        g.drawString("Po Vrouw Aantal: " + Povrouwaantal,20,80);
        g.drawString("Po Man Aantal: " + Pomanaantal,20,100);

        g.drawString("Totaal: " + Totaalaantal, 20, 120);

        setBackground(Color.gray);
    }


    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vrouwaantal ++;
            Totaalaantal ++;
            repaint();
        }
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Manaantal ++;
            Totaalaantal ++;
            repaint();
        }
    }

    class POvrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Povrouwaantal ++;
            Totaalaantal ++;
            repaint();
        }
    }

    class POmanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Pomanaantal ++;
            Totaalaantal ++;
            repaint();
        }
    }
}
