package H06;

import java.applet.Applet;
import java.awt.*;

public class Verdeling extends Applet {
    double a, b, antwoord;

    public void init(){
        a = 113;
        b = 4;
        antwoord = a/b;

    }
    public void paint(Graphics g){
        setBackground(Color.black);
        g.setColor(Color.cyan);
        g.drawString("Ali krijgt €" + antwoord, 20,100);
        g.drawString("Jeanette krijgt €" + antwoord, 120,100);
        g.drawString("Jan krijgt €" + antwoord, 250,100);
        g.drawString("Daniel krijgt €" + antwoord, 350,100);

    }
}
