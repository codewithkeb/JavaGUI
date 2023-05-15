import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public Login() {
        JFrame f = new JFrame();
        f.setTitle("McDonald's Login");
        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icon = Toolkit.getDefaultToolkit().getImage("src/splash.png");
        f.setIconImage(icon);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        p.setBackground(new Color(244, 247, 252));

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Welcome");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(229, 0, 1, 255));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        p.add(titleLabel, c);

        JLabel usernameLabel = new JLabel("Username:");
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_START;
        p.add(usernameLabel, c);

        JTextField usernameField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 1;
        p.add(usernameField, c);

        JLabel passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 2;
        p.add(passwordLabel, c);

        JPasswordField passwordField = new JPasswordField(20);
        c.gridx = 1;
        c.gridy = 2;
        p.add(passwordField, c);

        JButton lb = new JButton("Login");
        lb.setBackground(new Color(255, 199, 0, 255));
        lb.setForeground(Color.BLACK);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.BELOW_BASELINE_LEADING;
        p.add(lb, c);

        JButton rb = new JButton("Register");
        rb.setBackground(new Color(255, 199, 0, 255));
        rb.setForeground(Color.BLACK);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.BELOW_BASELINE_TRAILING;
        p.add(rb, c);

        lb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        rb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration process here
                f.setVisible(false);
                new Register();

            }
        });

        f.getContentPane().add(p);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
