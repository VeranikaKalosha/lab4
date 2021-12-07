import java.awt.Graphics2D;

public abstract class Figury {
    protected int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Figury(int x, int y){
        super ();
        this.x = x;
        this.y = y;
    }
    public Figury(){
        this(1,1);
    }

    public abstract void draw (Graphics2D g2d);
}

