import javax.swing.*;
import java.awt.*;
public class dibujo2 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int alto = getHeight();
        int ancho = getWidth();
        int x1=0;
        int y2;
        for (y2=alto; y2>=0; y2-=40){
            g.drawLine(x1, alto, ancho, y2);
            x1+=40;
        }
        x1=0;
        for (y2=alto; y2>=0; y2-=40){
            g.drawLine(ancho, alto, x1, y2);
            x1+=40;
        }
        x1=0;
        for (y2=alto/2; y2<=alto; y2+=10){
            g.drawLine(x1, alto/2, ancho/2, y2);
            x1+=10;
        }
    }
}
