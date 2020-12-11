package H012;

import java.applet.Applet;

public class h0121 extends Applet {
    public void init(){
        salaris[0] = 100;
        salaris[1] = 200;
        salaris[2] = 300;
        salaris[3] = 400;
        salaris[4] = 500;
        (int teller = 0; teller < 5; teller ++)
        salaris[teller] = 100 * (teller + 1);
    }

}
