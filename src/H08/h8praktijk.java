package H08;



import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class h8praktijk extends Applet {

        Button Keer, Delen, Plus, Minus;
        TextField tekstvak1, tekstvak2;
        String s, b;
        double getal, keer, gedeeld, plus, min;

        public void init() {
            tekstvak1 = new TextField("", 10);
            tekstvak2 = new TextField("", 10);
            Keer = new Button("*");
            Delen = new Button("/");
            Plus = new Button("+");
            Minus = new Button("-");

            Keer.addActionListener( new KeerknopListener() );
            Delen.addActionListener( new GedeeldknopListener() );
            Plus.addActionListener( new PlusknopListener() );
            Minus.addActionListener( new MinknopListener() );

            add(tekstvak1);
            add(tekstvak2);
            add(Keer);
            add(Delen);
            add(Plus);
            add(Minus);

        }

        public void paint(Graphics g) {
            setBackground(Color.gray);



        }

        class KeerknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak1.getText();
                String b = tekstvak2.getText();
                getal = Double.parseDouble( s );
                keer = Double.parseDouble( b );
                getal = getal*keer;
                tekstvak1.setText("" + getal);
                tekstvak2.setText("");
                repaint();
            }
        }

        class GedeeldknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak1.getText();
                String b = tekstvak2.getText();
                getal = Double.parseDouble( s );
                gedeeld = Double.parseDouble( b );
                getal = getal/gedeeld;
                tekstvak1.setText("" + getal);
                tekstvak2.setText("");
                repaint();
            }
        }

        class PlusknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak1.getText();
                String b = tekstvak2.getText();
                getal = Double.parseDouble( s );
                plus = Double.parseDouble( b );
                getal = getal+plus;
                tekstvak1.setText("" + getal);
                tekstvak2.setText("");
                repaint();
            }
        }

        class MinknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s = tekstvak1.getText();
                String b = tekstvak2.getText();
                getal = Double.parseDouble( s );
                min = Double.parseDouble( b );
                getal = getal-min;
                tekstvak1.setText("" + getal);
                tekstvak2.setText("");
                repaint();
            }
        }

    }

