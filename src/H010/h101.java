package H010;



import java.awt .*;
import java.applet .*;
import java.awt.event .*;


    public class h101 extends Applet {

        int getal, uitkomst;
        TextField tekstvak;

        public void init() {
            tekstvak = new TextField(50);
            tekstvak.addActionListener(new VakListener());
            add(tekstvak);
            uitkomst = 0;


        }

        public void paint(Graphics g) {

            setBackground(Color.gray);
            g.drawString(String.valueOf(uitkomst), 200, 45);

        }


        class VakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                String s;

                s = tekstvak.getText();
                getal = Integer.parseInt(s);
                if (getal > uitkomst) {
                    uitkomst = getal;
                }
                repaint();
            }
        }
    }

