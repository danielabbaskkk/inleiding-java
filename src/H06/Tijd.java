package H06;

        import java.awt.*;
        import java.applet.*;

public class Tijd extends Applet {

    int Seconden;
    int Uren;
    int Dagen;
    int Jaar;

    public void init() {

        Seconden = 60;
        Uren = Seconden*600;
        Dagen = Seconden*60*24;
        Jaar = Seconden*60*24*365;

    }

    public void paint(Graphics g) {

        setBackground(Color.darkGray);
        g.setColor(Color.white);
        g.drawString("Aantal seconden in een uur: " + Uren,20,20);
        g.drawString("Aantal seconden in een dag: " + Dagen, 20,40);
        g.drawString("Aantal seconden in een jaar: " + Jaar, 20,60);





    }

}
