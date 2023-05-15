import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    public Register() {
        JFrame f = new JFrame();
        f.setTitle("McDonald's Registration");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icon = Toolkit.getDefaultToolkit().getImage("src/splash.png");
        f.setIconImage(icon);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        p.setBackground(new Color(244, 247, 252));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        JLabel titleLabel = new JLabel("Registration");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(229, 0, 1, 255));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        p.add(titleLabel, constraints);

        JLabel unl = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.LINE_START;
        p.add(unl, constraints);

        JTextField unf = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        p.add(unf, constraints);

        JLabel pl = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.LINE_START;
        p.add(pl, constraints);

        JPasswordField pf = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        p.add(pf, constraints);

        JLabel el = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        p.add(el, constraints);

        JTextField ef = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 3;
        p.add(ef, constraints);

        JButton rb = new JButton("Register Now");
        rb.setBackground(new Color(255, 199, 0, 255));
        rb.setForeground(Color.BLACK);
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        p.add(rb, constraints);

        f.getContentPane().add(p);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        rb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration process here
                registerUser(unf.getText(), ef.getText());

                // Show success dialog
                showSuccessDialog(f);
            }
        });
    }

    public static void showSuccessDialog(JFrame parentFrame) {
        JOptionPane.showMessageDialog(parentFrame, "Registration Successful!", "Success",
                JOptionPane.INFORMATION_MESSAGE);

        // Return to login form
        parentFrame.dispose();
        new Login();
    }

    public static void registerUser(String username, String email) {
        System.out.println("Registering user: " + username + ", " + email);
    }
}
