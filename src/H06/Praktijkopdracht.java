package H06;

        import java.awt.*;
        import java.applet.*;

public class Praktijkopdracht extends Applet {

    double a, b, c, antwoord;
    int gemiddelde;
    double eindantwoord;

    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        antwoord = (a + b + c) / 3;
        gemiddelde = (int) (antwoord * 10.0);
        eindantwoord = gemiddelde / 10.0;
    }



    public void paint(Graphics g) {

        setBackground(Color.gray);
        g.setColor(Color.white);
        g.drawString("Het gemiddelde is: " + eindantwoord,20,20);






    }
}