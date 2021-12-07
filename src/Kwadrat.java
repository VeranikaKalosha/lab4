import java.awt.*;

public class Kwadrat extends Figury {

    private final int a=40;

    public Kwadrat (int x, int y){super(x,y);}

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(79, 255, 117));
        g2d.fillRect(x-Math.round(a/2),y-Math.round(a/2),a,a);
    }
}
