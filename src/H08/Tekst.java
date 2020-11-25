package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tekst extends Applet {
    TextField tv;
    Button okknop, resetknop;
    String L;
    public void init(){
        tv = new TextField("",50);
        okknop = new Button("ok");
        resetknop = new Button("reset");
        okknop.addActionListener(new okknopListener());
        resetknop.addActionListener(new ResetknopListener() );
        add(tv);
        add(okknop);
        add(resetknop);
    }
public void paint(Graphics g){

        g.setFont(new Font("default", Font.BOLD, 12 ));
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString(L,20,60);


}
class okknopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            L = tv.getText();
            repaint();
        }

}

    private class ResetknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            tv.setText("");
            repaint();
        }
    }
}
