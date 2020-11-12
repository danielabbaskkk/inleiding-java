package H06;


import java.applet.*;
        import java.awt.*;

public class Positiefvsnegatief extends Applet {

    int a;
    int b;
    int c;
    int antwoord;

    public void init() {

        a = 20;
        b = 40;
        c = -10;
        antwoord = (a + b) /c;

    }


    public void paint(Graphics g) {

        setBackground(Color.darkGray);
        g.setColor(Color.WHITE);
        g.drawString("De uitkomst is "  + antwoord,20,20);




    }
}