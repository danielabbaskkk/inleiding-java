package test;

import java.applet.Applet;
import java.awt.*;

public class testen extends Applet {


    public class Show extends Applet {

        public void init() {
            setSize(400, 300);
        }

        public void paint(Graphics g) {
            g.drawString("Welcome to Java!!", 50, 60 );
        }
    }
}
