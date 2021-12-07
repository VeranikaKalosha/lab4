import java.awt.*;

public class Okrag extends Figury {

    private final int w=40, h=40;

    public Okrag(int x, int y){super(x,y);}


    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(252, 255, 79));
        g2d.fillOval(x-Math.round(w/2), y-Math.round(h/2),w,h);
    }
}

