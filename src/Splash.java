import javax.swing.*;

public class Splash {
    public Splash() {
        JFrame f = new JFrame();
        ImageIcon img = new ImageIcon("src/splash.png");
        JLabel l = new JLabel(img);

        f.getContentPane().add(l);
        f.setUndecorated(true);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setBounds(700, 350, 200, 200);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        f.dispose();
    }

}
