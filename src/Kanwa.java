import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Kanwa extends JPanel implements MouseInputListener {
    public Kanwa() {
        setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
        setBackground(new Color(181, 247, 220));
        setLayout(null);
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);

                if (e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
                    okr = true;
                    kw = false;
                }
                if (e.getKeyChar() == 'k' || e.getKeyChar() == 'K') {
                    kw = true;
                    okr = false;
                }
            }
        });
        addMouseListener(this);

    }

    private boolean okr = false;
    private boolean kw = false;
    private boolean rysuj = true;
    Figury fg = null;


    public boolean isRysuj() {
        return rysuj;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        try {
            if (!isRysuj()) return;
            if (fg == null) return;

            fg.draw(g2d);

        } finally {
            g2d.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (okr) {
            fg = new Okrag(x, y);

        }
        if (kw) {
            fg = new Kwadrat(x, y);
        }
        repaint();
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}